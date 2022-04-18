package de.mem89.hexwiki.examples;

import de.mem89.hexwiki.core.Tile;
import de.mem89.hexwiki.core.TileProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleTileProcessor2 implements TileProcessor {
    Logger LOGGER = LogManager.getLogger(ExampleTileProcessor2.class);

    @Override
    public void before() {
        LOGGER.info("ExampleTileProcessor2#before()");
    }

    @Override
    public void process(Tile tile) {
        LOGGER.info("ExampleTileProcessor2#process({})",tile);
    }

    @Override
    public void after() {
        LOGGER.info("ExampleTileProcessor2#after()");
    }
}
