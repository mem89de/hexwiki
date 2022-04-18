package de.mem89.hexwiki.examples;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import de.mem89.hexwiki.core.TileProcessor;
import de.mem89.hexwiki.core.TileSource;

public class ExampleModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TileSource.class).to(ExampleTileSource.class);

        Multibinder<TileProcessor> tileProcessors = Multibinder.newSetBinder(binder(), TileProcessor.class);
        tileProcessors.addBinding().to(ExampleTileProcessor1.class);
        tileProcessors.addBinding().to(ExampleTileProcessor2.class);
    }
}
