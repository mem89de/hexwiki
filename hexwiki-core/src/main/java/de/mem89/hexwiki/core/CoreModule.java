package de.mem89.hexwiki.core;

import com.google.inject.AbstractModule;

public class CoreModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TileProcessorLoop.class).to(DefaultTileProcessorLoop.class);
    }
}
