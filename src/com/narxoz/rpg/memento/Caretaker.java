package com.narxoz.rpg.memento;

import com.narxoz.rpg.combatant.HeroMemento;

public class Caretaker {
    private HeroMemento backup;

    public void setMemento(HeroMemento memento) {
        this.backup = memento;
    }

    public HeroMemento getMemento() {
        return backup;
    }
}