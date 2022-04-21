package de.mem89.hexwiki.hexkit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import de.mem89.hexwiki.core.Tile;
import de.mem89.hexwiki.core.TileSource;
import de.mem89.hexwiki.core.TileSourceException;
import de.mem89.hexwiki.hexkit.model.HexkitMapFile;
import de.mem89.hexwiki.hexkit.model.InfoLayerElement;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HexkitFileReader implements TileSource {
    @Inject
    private ObjectMapper objectMapper;

    @Inject
    private HexkitTileMapper hexkitTileMapper;

    @Inject
    @Named("hex-kit-mapfile")
    private File mapfile;


    @Override
    public Iterator<Tile> getTiles() {
        HexkitMapFile hexkitMapFile = readHexkitMapFile(mapfile);

        List<Tile> tiles = hexkitMapFile.getInfoLayer().stream()
                .map(infoLayerElement -> hexkitTileMapper.map(infoLayerElement))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        return tiles.iterator();
    }

    private HexkitMapFile readHexkitMapFile(File mapfile) {
        try {
            return objectMapper.readValue(mapfile, HexkitMapFile.class);
        } catch (IOException e) {
            throw new TileSourceException("Unable to read the hex kit file.", e);
        }
    }
}
