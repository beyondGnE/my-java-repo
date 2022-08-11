package com.eugenehk.fireball.cinder;

public class Cinder {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        Axe axe = new Axe();
        Weapon sword = new Sword();
        Weapon axe2 = new Axe();
        Weapon spear = new Spear();

        Talk blade = new Sword();
        Talk cleaver = new Axe();
        Talk lance = new Spear();

        for(Talk talk : new Talk[]{blade, cleaver, lance}) {
            talk.tellMe();
        }

        System.out.println("A more practical example of calling a common method from completely different classes.");
        for (Talk talk : new Talk[] {axe, spear, sword}) {
            talk.tellMe();
        }

        weapon.setPower(5);
        axe.setPower(5);
        axe2.setPower(5);
        sword.setPower(5);
        spear.setPower(5);
        // System.out.println(weapon.getPower());
        // System.out.println(axe.getPower());
        // System.out.println(axe2.getPower());

        // Weapon[] armory = new Weapon[]{weapon, axe, new Sword()};

        for (Weapon arm : new Weapon[]{spear, axe, sword}) {
            System.out.println(arm.getPower());
            arm.tellMe();
        }

        axe.specialMove();
        
        

    }
}
