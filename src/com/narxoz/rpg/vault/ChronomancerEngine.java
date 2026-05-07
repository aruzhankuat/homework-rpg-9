package com.narxoz.rpg.vault;

import com.narxoz.rpg.artifact.*;
import com.narxoz.rpg.combatant.*;
import com.narxoz.rpg.memento.Caretaker;

public class ChronomancerEngine {

    public void startAppraisalRun(Hero hero, Inventory inventory) {
        Caretaker caretaker = new Caretaker();

        caretaker.setMemento(hero.save());

        System.out.println("Начало осмотра в Хранилище. " + hero);

        ArtifactVisitor appraiser = new AppraisalVisitor();
        inventory.acceptAll(appraiser);

        System.out.println("\n--- Ой! Вы активировали ловушку Храма Времени! ---");
        hero.applyPenalty(90, 200);
        System.out.println("Состояние после ловушки: " + hero);

        System.out.println("\nАктивация перемотки времени...");
        hero.restore(caretaker.getMemento());

        VaultRunResult result = new VaultRunResult("Успешно восстановлено");
        result.printResult();

        System.out.println("Финальное состояние героя: " + hero);
    }
}