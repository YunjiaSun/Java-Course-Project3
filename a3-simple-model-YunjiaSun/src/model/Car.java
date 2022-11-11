package model;

/** 
 * Information about a car includes:
 * 
 * - Model name
 * - Manufacturer
 * - Year
 * - Body
 * - Engine
 * 
**/

public class Car {
    String modelName;
    String manufacturer;
    String year;
    Body body;
    Engine engine;

    public Car(String modelName,String Manufacturer,String Year) {
        this.modelName = modelName;
        this.manufacturer= Manufacturer;
        this.year= Year;
        
        body = new Body();
        engine = new Engine();
    }


    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setManufacturer(String Manufacturer) {
        this.manufacturer = Manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setYear(String Year) {
        this.year = Year;
    }

    public String getYear() {
        return year;
    }

    public void setColor(String color) {
        this.body.setColor(color);
    }

    public String getColor() {
        return body.getColor();
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.body.setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return this.body.getNumberOfDoors();
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.engine.setNumberOfCylinders(numberOfCylinders);
    }

    public int geNumberOfCylinders() {
        return this.engine.getNumberOfCylinders();
    }

    public void setPowerOutputInHorsePower(double powerOutputInHorsePower) {
        this.engine.setPowerOutputInHorsePower(powerOutputInHorsePower);
    }

    public double getPowerOutputInHorsePower() {
        return this.engine.getPowerOutputInHorsePower();
    }

    public void printCarInfo() {
        System.out.println("Car Model Name: \t" + this.getModelName());
        System.out.println("Car Manufacturer: \t" + this.getManufacturer());
        System.out.println("Car Year: \t" + this.getYear());
        this.body.printBodyInfo();
        this.engine.printEngineInfo();
    }
}







