package de.mem89.hexwiki.core;

import java.util.List;

public class TileProcessorLoop {
    private TileSource tileSource;
    private List<TileProcessor> processors;

    public void process(){
        before();
        processTiles();
        after();
    }

    private void before() {
        for(TileProcessor processor:processors) {
            processor.before();
        }
    }

    private void processTiles() {
        while(tileSource.hasNext()) {
            Tile tile =  tileSource.next();
            for(TileProcessor processor : processors) {
                processor.process(tile);
            }
        }
    }

    private void after() {
        for(TileProcessor processor:processors) {
            processor.after();
        }
    }
}
