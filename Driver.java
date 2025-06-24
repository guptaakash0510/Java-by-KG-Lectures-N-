public class Driver {
    public static void main(String[] args) {

     /*   Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel()); // fuel level = 5;
        myCar.drive(); // fuel = 4
        myCar.drive(); // fuel = 3
        myCar.drive(); // fuel = 2
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel()); */

        Car swift = new Car();
        swift.addFuel(6);
      //  Car startedCar = swift.start();
        //  startedCar.drive();
        swift.start().drive();
    }
}
