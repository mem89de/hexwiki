package de.mem89.hexwiki.examples;

import de.mem89.hexwiki.core.Tile;
import de.mem89.hexwiki.core.TileProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleTileProcessor1 implements TileProcessor {
    Logger LOGGER = LogManager.getLogger(ExampleTileProcessor1.class);

    @Override
    public void before() {
        LOGGER.info("ExampleTileProcessor1#before()");
    }

    @Override
    public void process(Tile tile) {
        LOGGER.info("ExampleTileProcessor1#process({})", tile);
    }

    @Override
    public void after() {

        LOGGER.info("ExampleTileProcessor1#after()");
    }
}
