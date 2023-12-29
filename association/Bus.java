package com.inheritance;

import com.acessspecifier.demo.Car;

public class Bus extends Car {



    Bus()
    {
        ride();
        carry();

    }
    public void ride()
    {
        System.out.println("over ride");
    }
    public void carry()
    {

    }

    public static void main(String[] args) {
        Bus bus=new Bus();
        bus.carry();
        Car car=new Car(10);
        car.carry();
    }


}
