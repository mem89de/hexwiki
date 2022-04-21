package de.mem89.hexwiki.core;

import com.google.inject.AbstractModule;

public class LogProcessorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TileProcessor.class).to(LogTileProcessor.class);
    }
}
