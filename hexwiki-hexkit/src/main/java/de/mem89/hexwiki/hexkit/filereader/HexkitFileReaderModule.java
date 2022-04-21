package de.mem89.hexwiki.hexkit.filereader;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import de.mem89.hexwiki.core.TileSource;

import java.io.File;

public class HexkitFileReaderModule extends AbstractModule {
    private File mapFile;

    public HexkitFileReaderModule(File mapFile) {
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
