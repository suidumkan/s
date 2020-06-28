package com.company;

public class Main {
    public static final String BLUE = "\u001B[34m";
    public static final String GREEN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Boss boss = new Boss(90, 29.5, GREEN + " Способность летать ", new Weapon(ANSI_RED + "Пулемет", BLUE + "Пулемет НСВ    "));

        System.out.println(ANSI_CYAN + " Название оружие: " + boss.getWeapon().getNameOfWeapon()
                + "_____________"
                + ANSI_YELLOW + " тип оружие: " + boss.getWeapon().getTypeOfWeapon()
                + "_______________"
                + ANSI_BLACK + " урон: " + boss.getDamage()
                + "______________"
                + ANSI_BLUE + " здоровье: " + boss.getHealth()
                + "______________" + ANSI_GREEN + " СуперУмение: " + boss.getSuperAbilities());


    }
}
