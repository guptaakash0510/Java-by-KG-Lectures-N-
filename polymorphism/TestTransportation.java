package polymorphism;

public class TestTransportation {

    public static void main(String[] args) {

        Car c = new Car();
      //  Vehicle v = new Vehicle();
        Plane p = new Plane();

      //  castTest(v);
        castTest(c);  //used for casting of Car in castTest Method.
        castTest(p);

      //  Vehicle vCar = new Car();
        // Car cVehicle = (Car)new Vehicle(); // ... Not possible bcz every vehicle is not car.

        // Object ref = new Car();


    }

    private static void castTest(Vehicle veh) {
     //  veh.start();
       // Car cVehicle = (Car) veh;
        // veh.noOfDoors(); //not allowed. Because veh is not casted as car.
      //  ((Car) veh).noOfDoors();
      //  cVehicle.start();
        // cVehicle.noOfDoors();
        veh.start();
    }
}
