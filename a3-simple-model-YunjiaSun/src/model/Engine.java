package model;

/**
 * Information about Engine include:
 * 
 * - Number of Cylinders
 * - Power output in Horse power
 */


public class Engine {
    int numberOfCylinders;
    double powerOutputInHorsePower;

    public void setNumberOfCylinders(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfCylinders(){
        return numberOfCylinders;
    }

    public void setPowerOutputInHorsePower(double powerOutputInHorsePower){
        this.powerOutputInHorsePower = powerOutputInHorsePower;
    }

    public double getPowerOutputInHorsePower(){
        return powerOutputInHorsePower;
    }

    public void printEngineInfo() {
        System.out.println("Number of Cylinders: \t" + this.getNumberOfCylinders());
        System.out.println("Power output in Horse power: \t" + this.getPowerOutputInHorsePower());
    }
}
