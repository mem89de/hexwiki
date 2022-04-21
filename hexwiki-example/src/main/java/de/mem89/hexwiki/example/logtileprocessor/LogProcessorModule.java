package de.mem89.hexwiki.example.logtileprocessor;

import com.google.inject.AbstractModule;
import de.mem89.hexwiki.core.DefaultTileProcessorFactory;
import de.mem89.hexwiki.core.TileProcessor;
import de.mem89.hexwiki.core.TileProcessorFactory;

public class LogProcessorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TileProcessorFactory.class).to(DefaultTileProcessorFactory.class);
        bind(TileProcessor.class).to(LogTileProcessor.class);
    }
}
