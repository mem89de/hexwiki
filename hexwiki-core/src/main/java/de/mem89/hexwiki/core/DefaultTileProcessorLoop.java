package de.mem89.hexwiki.core;

import com.google.inject.Inject;

import java.util.Iterator;

public class DefaultTileProcessorLoop implements TileProcessorLoop {
    @Inject
    private TileSource tileSource;
    @Inject
    private TileProcessorFactory tileProcessorFactory;

    @Override
    public void process() {
        TileProcessor tileProcessor = tileProcessorFactory.create();
        Iterator<Tile> tileIterator = tileSource.getTiles();

        while (tileIterator.hasNext()) {
            tileProcessor.process(tileIterator.next());
        }
    }
}
