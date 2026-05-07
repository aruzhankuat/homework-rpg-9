package com.narxoz.rpg.vault;

public class VaultRunResult {
    private String status;

    public VaultRunResult(String status) {
        this.status = status;
    }

    public void printResult() {
        System.out.println("--- Результат забега: " + status + " ---");
    }
}