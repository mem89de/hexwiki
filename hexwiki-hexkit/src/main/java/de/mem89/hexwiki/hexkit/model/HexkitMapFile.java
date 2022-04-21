package de.mem89.hexwiki.hexkit.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class HexkitMapFile {
    private List<InfoLayerElement> infoLayer;

    public List<InfoLayerElement> getInfoLayer() {
        return infoLayer;
    }

    public void setInfoLayer(List<InfoLayerElement> infoLayer) {
        this.infoLayer = infoLayer;
    }
}
