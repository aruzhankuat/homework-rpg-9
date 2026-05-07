package com.narxoz.rpg.combatant;

public class Hero {
    private String name;
    private int hp;
    private int gold;

    public Hero(String name, int hp, int gold) {
        this.name = name;
        this.hp = hp;
        this.gold = gold;
    }

    public HeroMemento save() {
        System.out.println("[Memento] Создан кристалл времени для " + name);
        return new HeroMemento(hp, gold);
    }

    public void restore(HeroMemento memento) {
        if (memento != null) {
            this.hp = memento.getHp();
            this.gold = memento.getGold();
            System.out.println("[Memento] Состояние героя восстановлено.");
        }
    }

    public void applyPenalty(int damage, int loss) {
        this.hp -= damage;
        this.gold -= loss;
    }

    @Override
    public String toString() {
        return name + " {HP: " + hp + ", Gold: " + gold + "}";
    }
}