package de.mem89.hexwiki.hexkit.filereader;

import de.mem89.hexwiki.core.DefaultTile;
import de.mem89.hexwiki.core.Tile;
import de.mem89.hexwiki.hexkit.filereader.model.InfoLayerElement;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;
public class HexkitTileMapper {

    public Optional<Tile> map(InfoLayerElement infoLayerElement) {
        String label = StringUtils.defaultString(infoLayerElement.getLabel().getText());
        String markdown = StringUtils.defaultString(infoLayerElement.getData());

        if(StringUtils.isAllBlank(label, markdown)){
            return Optional.empty();
        }

        return Optional.of(mapTile(label, markdown));
    }

    private Tile mapTile(String label, String markdown) {
        DefaultTile tile = new DefaultTile();

        tile.setLabel(label);
        tile.setMarkdown(markdown);
        return tile;
    }
}
