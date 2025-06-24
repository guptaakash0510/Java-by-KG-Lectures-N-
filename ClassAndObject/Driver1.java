package ClassAndObject;

public class Driver1 {

    static int minAgeForDriving = 18;
    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }
    public static void main(String[] args) {



     /*   Car1 myCar = new Car1();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel()); */

        Car1 swift = new Car1("Red");
        Car1 thar = new Car1();
        //swift.addFuel(6);
        swift.start().drive();   // Topic constructor
       // System.out.println(swift.color); //Topic constructor
        System.out.println(thar.currentFuelInLiters);

      /*  swift.start();
        swift.drive(); */

      //  Car1 startedCar = swift.start();
        // startedCar.drive();

        //swift.start().drive();

   // Driver1 myDriver = new Driver1();
     //   myDriver.dateOfLicense = "1/Jan/2024";
       // System.out.println(minAgeForDriving);

    }
}
