package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Mercedes();
        Car car2 = new Maserati();

        Mercedes mercedes = new Mercedes();
        Maserati maserati = new Maserati();

        car1.setColor(Color.BLUE.toString());
        car1.setModel("BMW x5");
        car1.setCapacity(5);
        Driver driver1 = new Driver();
        driver1.setName("Alexandru");
        driver1.setDriverLicense("B");
        car1.setDriver(driver1);

        car2.setColor(Color.ORANGE.toString());
        car2.setColor("Volkswagen");
        car2.setCapacity(4);
        Driver driver2 = new Driver();
        driver2.setName("Cristian");
        driver2.setDriverLicense("A,B,C");
        car2.setDriver(driver2);

        mercedes.setColor(Color.GREEN.toString());
        mercedes.setModel("A320");
        mercedes.setCapacity(6);
        Driver driverMe = new Driver();
        driverMe.setName("Vladimir");
        driverMe.setDriverLicense("B2");
        mercedes.setDriver(driverMe);

        maserati.setColor(Color.BLACK.toString());
        maserati.setModel("Modena");
        maserati.setCapacity(8);
        Driver driverMa = new Driver();
        driverMa.setName("Mihail");
        driverMa.setDriverLicense("B,C,D");
        maserati.setDriver(driverMa);

        Passenger[] passengers = new Passenger[7];

        try {
            for (int i = 0; i < passengers.length; i++)
                mercedes.addPassenger(passengers[i]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Integer MeAge = 21;
        Man me = new Man("Eugeniu", MeAge, maserati);

        int superManAge = 30;
        Man superMan = new Man("Lena", superManAge, mercedes);

        Man superman2 = new Man("Lena", superManAge, mercedes);

        System.out.println(superMan.equals(superman2));
        System.out.println(car1.equals(car2));

        System.out.println(car1.accelerate(201));

        Maserati maserati1 = new Maserati();
        maserati.setColor(Color.BLUE.toString());
        Car car = maserati;

        System.out.println(car.getColor());
    }
}
