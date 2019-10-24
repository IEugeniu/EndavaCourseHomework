package com.company;

public class Maserati extends Car {
    private String anul;

    public String getAnul() {
        return anul;
    }

    public void setAnul(String anul) {
        this.anul = anul;
    }

    public int accelerate(int power) {
        if(power < 0)
            return 0;
        else if(power > 400)
            return 400;
        else return power;
    }

    @Override
    public void speedSwitch(int acceleration) {
        if(acceleration == 0){

        }
        else if (acceleration < 20)
            speed = 1;
        else if(acceleration < 30)
            speed = 2;
        else if(acceleration < 50)
            speed = 3;
        else if(acceleration < 80)
            speed = 4;
        else
            speed = 5;
        System.out.println("Car speed is " + speed);
    }

    @Override
    public void speedSwitch(int acceleration, int speed) {
        if(speed >= 1 && speed <= 5)
            super.speed = speed;
        else System.out.println("Incorrect speed");
    }
}
