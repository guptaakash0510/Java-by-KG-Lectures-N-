package ClassAndObject;

import javax.swing.*;

public class Car1 {
  static   int noOfCarsSold; //static variable can be called only by using the class name. No object is required to call the static variable.It is the Property of the class.
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static{
        System.out.println("I am in static block"); //Static block called when jvm load the class.
        noOfCarsSold = 0;
    }

    {
        noOfCarsSold++;
        System.out.println("I am in Init block"); // This is called when the jvm is creating the object.
    }

    Car1() {
        this("Black");
        currentFuelInLiters = 5;
       /* noOfWheels = 4;   //Topic no argument constructor
        color = "Black";
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5; */
    }

    Car1(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    public /*void */ Car1 start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel,can not start");
        } else if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode,please refuel");
        } else {
            System.out.println("Car is started...bruhhh.....");
        }
        return this;
    }
    public void drive() {
            currentFuelInLiters--;
            System.out.println("Car is driving");

        }


    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters +=currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
