package com.narxoz.rpg.combatant;

public class HeroMemento {
    private final int hp;
    private final int gold;

    HeroMemento(int hp, int gold) {
        this.hp = hp;
        this.gold = gold;
    }

    int getHp() { return hp; }
    int getGold() { return gold; }
}
