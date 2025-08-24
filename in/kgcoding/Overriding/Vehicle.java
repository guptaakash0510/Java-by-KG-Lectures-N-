package in.kgcoding.Overriding;

public class Vehicle {

    private int noOfTires;

    Vehicle() {
        this.noOfTires = 0;
    }

    Vehicle(int noOfTire) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires(){
        return this.noOfTires;
    }

    public  void start(){
        System.out.println("Vehicle is starting....");
    }
}

