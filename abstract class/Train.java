package com.xworkz;

public class Train extends BulletTrain{
    @Override
    public void bulletTrainSpeed() {
        System.out.println("speed of bullet train is around 1000km/h ");
    }
    @Override
    void startsIn()
    {
        System.out.println("this will starts very soon");
    }

    public static void main(String[] args) {
        BulletTrain bulletTrain=new Train();
        bulletTrain.bulletTrainSpeed();
        bulletTrain.startsIn();
    }
}
