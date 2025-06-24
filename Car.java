public class Car {

    // Instance variable
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // Instance Method

    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel,cannot start");
        }
        else if(currentFuelInLiters < 5){
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInLiters--;
        }
        else {
            System.out.println("Car is started");
            currentFuelInLiters--;
        }
        return this;
    }

    public void drive(){

            System.out.println("Car is driving");
            currentFuelInLiters--;

    }

   /*  public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    } */

    // now let's see uses of this keyword
    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
