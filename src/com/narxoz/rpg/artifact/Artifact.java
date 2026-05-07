package com.narxoz.rpg.artifact;

public abstract class Artifact {
    private String name;

    public Artifact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void accept(ArtifactVisitor visitor);
}
