package com.narxoz.rpg.artifact;

public class Ring extends Artifact {
    public Ring(String name) { super(name); }

    @Override
    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
