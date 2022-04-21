package de.mem89.hexwiki.example.logtileprocessor;

import com.google.inject.AbstractModule;
import de.mem89.hexwiki.core.TileProcessor;

public class LogProcessorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TileProcessor.class).to(LogTileProcessor.class);
    }
}
