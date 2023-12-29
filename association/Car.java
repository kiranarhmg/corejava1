package com.acessspecifier.demo;


public class Car {
    protected Car()
    {
        System.out.println("protected no-arg const of car");
    }
    public Car(int no)
    {
        this("kiran");
        System.out.println(" public arg const");

    }
    private Car(String name){
        System.out.println("string arg const");
    }
    Car(double cost)
    {
        System.out.println("double arg const");
    }
    protected void ride()
    {
        System.out.println("protected no-arg const of car");
    }
    public void carry()
    {
        System.out.println("public method");
    }
    void run()
    {
        move();
        System.out.println("package default");

    }
    private void move()
    {
        System.out.println("private methode");
    }

}
