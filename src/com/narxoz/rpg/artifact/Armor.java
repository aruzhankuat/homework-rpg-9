package com.narxoz.rpg.artifact;

public class Armor extends Artifact {
    public Armor(String name) { super(name); }

    @Override
    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}