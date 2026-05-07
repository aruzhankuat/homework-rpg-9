package com.narxoz.rpg.artifact;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Artifact> items = new ArrayList<>();

    public void addArtifact(Artifact artifact) {
        items.add(artifact);
    }

    public List<Artifact> getItems() {
        return items;
    }
    public void acceptAll(ArtifactVisitor visitor) {
        for (Artifact item : items) {
            item.accept(visitor);
        }
    }
}
