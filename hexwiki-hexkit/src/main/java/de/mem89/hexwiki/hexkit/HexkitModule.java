package de.mem89.hexwiki.hexkit;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import de.mem89.hexwiki.core.TileSource;

import java.io.File;

public class HexkitModule extends AbstractModule {
    private File mapFile;

    public HexkitModule(File mapFile) {
        this.mapFile = mapFile;
    }

    @Override
    protected void configure() {
        bind(TileSource.class).to(HexkitFileReader.class);
    }

    @Provides
    @Named("hex-kit-mapfile")
    public File provideMapFile() {
        return mapFile;
    }
}
