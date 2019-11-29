package org.rcsb.cif.text;

import org.rcsb.cif.CifOptions;
import org.rcsb.cif.ParsingException;
import org.rcsb.cif.model.BaseBlock;
import org.rcsb.cif.model.BaseBlockGeneric;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.BlockGeneric;
import org.rcsb.cif.model.TextFile;
import org.rcsb.cif.model.TextFileGeneric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextCifReaderGeneric {
    private final CifOptions options;

    public TextCifReaderGeneric(CifOptions options) {
        this.options = options;
    }

    public TextFileGeneric read(InputStream inputStream) throws ParsingException, IOException {
        String content = new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .collect(Collectors.joining("\n"));
        inputStream.close();
        return readText(content);
    }

    public TextFileGeneric readText(String data) throws ParsingException {
        if (data.isEmpty()) {
            throw new ParsingException("Cannot parse empty file.");
        }

        final List<BlockGeneric> dataBlocks = new ArrayList<>();
        final TokenizerState tokenizer = new TokenizerState(data);
        String blockHeader = "";

        FrameContext blockCtx = new FrameContext();

        boolean inSaveFrame = false;

        // the next three initial values are never used in valid files
        List<BlockGeneric> saveFrames = new ArrayList<>();
        FrameContext saveCtx = new FrameContext();
        BlockGeneric saveFrame = new BaseBlockGeneric(saveCtx.getCategories(), "");

        tokenizer.moveNext();
        while (tokenizer.getTokenType() != CifTokenType.END) {
            CifTokenType token = tokenizer.getTokenType();

            // data block
            if (token == CifTokenType.DATA) {
                if (inSaveFrame) {
                    throw new ParsingException("Unexpected data block inside a save frame.", tokenizer.getLineNumber());
                }
                if (blockCtx.getCategories().size() > 0) {
                    BaseBlockGeneric block = new BaseBlockGeneric(blockCtx.getCategories(), blockHeader);
                    dataBlocks.add(block);
                    block.getSaveFrames().addAll(saveFrames);
                }
                blockHeader = tokenizer.getData().substring(tokenizer.getTokenStart() + 5, tokenizer.getTokenEnd());
                blockCtx = new FrameContext();
                saveFrames.clear();
                tokenizer.moveNext();
                // save frame
            } else if (tokenizer.getTokenType() == CifTokenType.SAVE) {
                final String saveHeader = tokenizer.getData().substring(tokenizer.getTokenStart() + 5, tokenizer.getTokenEnd());
                if (saveHeader.isEmpty()) {
                    if (saveCtx.getCategories().size() > 0) {
                        saveFrames.add(saveFrame);
                    }
                    inSaveFrame = false;
                } else {
                    if (inSaveFrame) {
                        throw new ParsingException("Save frames cannot be nested.", tokenizer.getLineNumber());
                    }
                    inSaveFrame = true;
                    final String safeHeader = tokenizer.getData().substring(tokenizer.getTokenStart() + 5, tokenizer.getTokenEnd());
                    saveCtx = new FrameContext();
                    saveFrame = new BaseBlockGeneric(saveCtx.getCategories(), safeHeader);
                }
                tokenizer.moveNext();
                // loop
            } else if (token == CifTokenType.LOOP) {
                tokenizer.handleLoop(inSaveFrame ? saveCtx : blockCtx, true);
                // single row
            } else if (token == CifTokenType.COLUMN_NAME) {
                tokenizer.handleSingle(inSaveFrame ? saveCtx : blockCtx, true);
                // out of options
            } else {
                throw new ParsingException("Unexpected token (" + token + "). Expected data_, loop_, or data name.", tokenizer.getLineNumber());
            }
        }

        // check if the latest save frame was terminated
        if (inSaveFrame) {
            throw new ParsingException("Unfinished save frame (" + saveFrame.getBlockHeader() + ").", tokenizer.getLineNumber());
        }

        if (blockCtx.getCategories().size() > 0 || saveFrames.size() > 0) {
            BaseBlockGeneric block = new BaseBlockGeneric(blockCtx.getCategories(), blockHeader);
            dataBlocks.add(block);
            block.getSaveFrames().addAll(saveFrames);
        }

        return new TextFileGeneric(dataBlocks);
    }
}