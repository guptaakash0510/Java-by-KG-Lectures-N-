package in.knowledgegate;

import getterSetter.Car2;

public class GetterTest {

    public static void main(String[] args) {
        Car2 car = new Car2("Red","Maruti",3, 8000);

        car.setColor("Blue");
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }
    }



