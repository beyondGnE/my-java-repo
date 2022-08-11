package com.eugenehk.fireball.cinder;

public class Sword extends Weapon {
    public Sword() {
        super();
        System.out.println("My lean figure gives you speed.");
    }

    @Override
    public void setPower(int apower) {
        super.setPower(apower * 2);

    }

    public void tellMe() {
        System.out.println("I am a sword");
    }
}
