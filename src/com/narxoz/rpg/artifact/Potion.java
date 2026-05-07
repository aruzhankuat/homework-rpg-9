package com.narxoz.rpg.artifact;

public class Potion extends Artifact {
    public Potion(String name) { super(name); }

    @Override
    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
