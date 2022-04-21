package de.mem89.hexwiki.core;

import com.google.inject.Inject;

public class DefaultTileProcessorFactory implements TileProcessorFactory{
    @Inject
    private TileProcessor tileProcessor;

    @Override
    public TileProcessor create() {
        return tileProcessor;
    }
}
