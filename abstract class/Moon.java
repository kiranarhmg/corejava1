package com.xworkz;

public class Moon extends Chandrayana4{

    @Override
    public void sendHuman() {
        System.out.println("isro planning to send ");
    }
    @Override
    void sendRobot()
    {
        System.out.println("send robot to moon in 2025");
    }

    public static void main(String[] args) {
        Chandrayana4 chandrayana4=new Moon() ;
        chandrayana4.sendHuman();
        chandrayana4.sendRobot();
    }
}
