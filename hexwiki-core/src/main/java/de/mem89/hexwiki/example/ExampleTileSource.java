package de.mem89.hexwiki.example;

import de.mem89.hexwiki.core.DefaultTile;
import de.mem89.hexwiki.core.Tile;
import de.mem89.hexwiki.core.TileSource;

import java.util.Arrays;
import java.util.Iterator;

public class ExampleTileSource implements TileSource {
    private Iterator<DefaultTile> tileIterator = Arrays.asList(
            new DefaultTile(),
            new DefaultTile(),
            new DefaultTile()
    ).iterator();

    @Override
    public boolean hasNext() {
        return tileIterator.hasNext();
    }

    @Override
    public Tile next() {
        return tileIterator.next();
    }
}
