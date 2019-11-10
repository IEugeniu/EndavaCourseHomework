package com.company;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;

public abstract class Car implements Accelerate {
    protected String color;
    protected String model;
    protected String typeOfBox;
    protected int capacity;
    protected int speed = 0;
    protected List<Passenger> passengerList;
    protected Driver driver;

    public Car() {
        passengerList = new ArrayList<>();
        driver = new Driver();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", typeOfBox='" + typeOfBox + '\'' +
                ", capacity='" + capacity + '\'' +
                ", speed=" + speed +
                '}');
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed &&
                Objects.equals(color, car.color) &&
                Objects.equals(model, car.model) &&
                Objects.equals(typeOfBox, car.typeOfBox) &&
                Objects.equals(capacity, car.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, typeOfBox, capacity, speed);
    }

    public int accelerate(int power) {
        return 0;
    }

    public void speedSwitch(int acceleration) {

    }

    public void speedSwitch(int acceleration, int speed) {

    }

    public void addPassenger(Passenger passenger) throws Exception {
        if(passengerList.size() < capacity)
            passengerList.add(passenger);
        else {
            throw new Exception("Maxim number of passenger");
        }
    }

    public void deletePassanger(Passenger passenger) throws Exception {
        if(passengerList.contains(passenger))
            passengerList.remove(passenger);
        else {
            throw new Exception("There is no such a passenger");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfBox() {
        return typeOfBox;
    }

    public void setTypeOfBox(String typeOfBox) {
        this.typeOfBox = typeOfBox;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
