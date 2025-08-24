package in.kgcoding.abstraction;

public class Car extends Vehicle {
    private int noOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vrommm.........");
    }

    @Override
    public void getSetGo() {
        System.out.println("going to place......");
    }
}
