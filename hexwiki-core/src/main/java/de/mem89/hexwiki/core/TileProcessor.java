package de.mem89.hexwiki.core;

public interface TileProcessor {
    public void before();
    public void process(Tile tile);
    public void after();
}
