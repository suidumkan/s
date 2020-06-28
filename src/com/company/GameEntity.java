package com.company;

public class GameEntity {
    private int health;
    private double damage;
    private String superAbilities;

    public GameEntity(int health, double damage, String superAbilities) {
        this.health = health;
        this.damage = damage;
        this.superAbilities = superAbilities;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getSuperAbilities() {
        return superAbilities;
    }

    public void setSuperAbilities(String superAbilities) {
        this.superAbilities = superAbilities;
    }
}
