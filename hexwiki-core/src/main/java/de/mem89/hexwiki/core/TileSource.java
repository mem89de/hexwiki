package de.mem89.hexwiki.core;

import de.mem89.hexwiki.core.Tile;

import java.util.Iterator;

public interface TileSource {
    public Iterator<Tile> getTiles();
}
