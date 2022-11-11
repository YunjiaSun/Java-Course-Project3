package ui;

import model.Car;


public class Main {
    public static void main(String[] args) throws Exception {


        
        Car bmwX3 = new Car("BMW","x3","2021");
        bmwX3.setColor("Black");
        bmwX3.setNumberOfDoors(4);
        bmwX3.setNumberOfCylinders(2);
        bmwX3.setPowerOutputInHorsePower(245.0);
        bmwX3.printCarInfo();

        Car porsche911  = new Car("Porsche","911","2022");
        porsche911.setColor("White");
        porsche911.setNumberOfDoors(2);
        porsche911.setNumberOfCylinders(6);
        porsche911.setPowerOutputInHorsePower(640.0);
        porsche911.printCarInfo();

        Car mercedesGT = new Car("Mercedes","GT","2021");
        mercedesGT.setColor("Red");
        mercedesGT.setNumberOfDoors(4);
        mercedesGT.setNumberOfCylinders(6);
        mercedesGT.setPowerOutputInHorsePower(500.0);
        mercedesGT.printCarInfo();

        Car bmwX6 = new Car("BMW","x6","2021");
        bmwX6.setColor("Silver");
        bmwX6.setNumberOfDoors(4);
        bmwX6.setNumberOfCylinders(4);
        bmwX6.setPowerOutputInHorsePower(245.0);
        bmwX6.printCarInfo();

        Car bentleyS1 = new Car("Bentley Motor","S1","2021");
        bentleyS1.setColor("Black");
        bentleyS1.setNumberOfDoors(4);
        bentleyS1.setNumberOfCylinders(6);
        bentleyS1.setPowerOutputInHorsePower(700.0);
        bentleyS1.printCarInfo();
    }
}
