package com.narxoz.rpg.artifact;

public class Scroll extends Artifact {
    public Scroll(String name) { super(name); }

    @Override
    public void accept(ArtifactVisitor visitor) {
        visitor.visit(this);
    }
}
