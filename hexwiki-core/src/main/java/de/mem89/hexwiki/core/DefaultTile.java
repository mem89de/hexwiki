package de.mem89.hexwiki.core;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DefaultTile implements Tile {
    private String label = "";
    private String markdown = "";

    public void setLabel(String label) {
        this.label = label;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getMarkdown() {
        return markdown;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
