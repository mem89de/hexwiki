package de.mem89.hexwiki.example.logtileprocessor;

import de.mem89.hexwiki.core.Tile;
import de.mem89.hexwiki.core.TileProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTileProcessor implements TileProcessor {

    Logger LOGGER = LogManager.getLogger(LogTileProcessor.class);

    @Override
    public void process(Tile tile) {
        LOGGER.info(tile.toString());
    }
}
