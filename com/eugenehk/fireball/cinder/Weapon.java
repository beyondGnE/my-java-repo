package com.eugenehk.fireball.cinder;

public class Weapon implements Talk {
    public Weapon() {
        System.out.println("This is weapon.");
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return this.power;
    }

    @Override
    public void tellMe() {}

    private int power;
}
