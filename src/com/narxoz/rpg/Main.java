package com.narxoz.rpg;

import com.narxoz.rpg.artifact.*;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.vault.ChronomancerEngine;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Aruzhan", 100, 500);


        Inventory inventory = new Inventory();
        inventory.addArtifact(new Weapon("Клинок Света"));
        inventory.addArtifact(new Armor("Панцирь Дракона"));
        inventory.addArtifact(new Ring("Кольцо Всевластия"));
        inventory.addArtifact(new Potion("Эликсир Жизни"));


        ChronomancerEngine engine = new ChronomancerEngine();
        engine.startAppraisalRun(hero, inventory);
    }
}