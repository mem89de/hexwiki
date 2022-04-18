package de.mem89.hexwiki.core;

import com.google.inject.Inject;

import java.util.Set;

public class DefaultTileProcessorLoop implements TileProcessorLoop{
    @Inject
    private TileSource tileSource;
    @Inject
    private Set<TileProcessor> processors;

    @Override
    public void process() {
        before();
        processTiles();
        after();
    }

    private void before() {
        for (TileProcessor processor : processors) {
            processor.before();
        }
    }

    private void processTiles() {
        while (tileSource.hasNext()) {
            Tile tile = tileSource.next();
            for (TileProcessor processor : processors) {
                processor.process(tile);
            }
        }
    }

    private void after() {
        for (TileProcessor processor : processors) {
            processor.after();
        }
    }
}
