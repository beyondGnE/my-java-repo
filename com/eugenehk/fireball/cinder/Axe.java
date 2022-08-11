package com.eugenehk.fireball.cinder;

public class Axe extends Weapon {
    public Axe() {
        super();
        System.out.println("But I am more hacky.");
    }

    @Override // Ensures that this method must override something in super class.
    public void setPower(int power) {
        // super.setPower(power);
        super.setPower(power * 5);
    }

    public void specialMove() {
        System.out.println("Gigahack!");
    }

    @Override
    public void tellMe() {
        System.out.println("I am an axe");
    }
}
