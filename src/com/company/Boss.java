package com.company;

public class Boss extends GameEntity {
    Weapon weapon;

    public Boss(int health, double damage, String superAbilities, Weapon weapon) {
        super(health, damage, superAbilities);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

