package com.learnquest.demos;

import java.time.LocalDate;
import java.time.Period;

public class Car {
    private int speed;
    private int gasoline;
    private boolean engineState;
    private String name;
    private LocalDate manufactured;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setManufactured(LocalDate manufactured) {
        this.manufactured = manufactured;
    }
    public LocalDate getManufactured() {
        return manufactured;
    }

    public int getAge() {
        return Period.between(getManufactured(), LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Car car54 = new Car();

        car54.setName("Car 54");
        car54.setSpeed(20);
        car54.setManufactured(LocalDate.of(1961, 9, 17));

        Car mach5 = new Car();

        mach5.setName("Mach V");
        mach5.setSpeed(250);
        mach5.setManufactured(LocalDate.of(1967, 4, 2));

        for (Car car : new Car[]{car54, mach5}) {
            System.out.printf("%s is %d years old and is traveling at %d mph%n",
            car.getName(), car.getAge(), car.getSpeed());
        }
    }
}
