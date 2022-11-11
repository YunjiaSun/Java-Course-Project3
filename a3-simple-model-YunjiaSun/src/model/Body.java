package model;

/** 
* Information about Body includes:
*
* - Color
* - Number of doors 
**/

public class Body {
    String color;
    int numberOfDoors;


    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;

    }

    public void printBodyInfo() {
        System.out.println("Body Color: \t" + this.getColor());
        System.out.println("Number of Doors: \t" + this.getNumberOfDoors());
    }

}
