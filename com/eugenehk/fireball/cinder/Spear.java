package com.eugenehk.fireball.cinder;

public class Spear extends Weapon {
    public Spear() {
        super();
        System.out.println("I have long reach requiring great flexibility.");
    }

    @Override // Ensures that this method must override something in super class.
    public void setPower(int power) {
        // super.setPower(power);
        super.setPower(power * 7);
    }

    @Override
    public void tellMe() {
        System.out.println("I am a spear.");
    }
}
