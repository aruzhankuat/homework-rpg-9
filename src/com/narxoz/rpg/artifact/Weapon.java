package com.narxoz.rpg.artifact;

public class Weapon extends Artifact {
    public Weapon(String name) { super(name); }

    @Override
    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
