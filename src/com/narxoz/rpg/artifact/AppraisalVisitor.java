package com.narxoz.rpg.artifact;

public class AppraisalVisitor implements ArtifactVisitor {
    @Override
    public void visit(Weapon weapon) {
        System.out.println("[Visitor] Оценка оружия: " + weapon.getName() + ". Состояние: Боевое.");
    }
    @Override
    public void visit(Potion potion) {
        System.out.println("[Visitor] Анализ зелья: " + potion.getName() + ". Магический состав стабилен.");
    }
    @Override
    public void visit(Scroll scroll) {
        System.out.println("[Visitor] Чтение свитка: " + scroll.getName() + ". Заклинание опознано.");
    }
    @Override
    public void visit(Ring ring) {
        System.out.println("[Visitor] Проверка кольца: " + ring.getName() + ". Обнаружена древняя аура.");
    }
    @Override
    public void visit(Armor armor) {
        System.out.println("[Visitor] Осмотр доспехов: " + armor.getName() + ". Защита подтверждена.");
    }
}