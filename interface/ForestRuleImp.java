package com.xworkz.place.kiran;

public class ForestRuleImp implements ForestRule{

    @Override
    public void noHunting() {
        System.out.println("hunting restricted");
    }

    @Override
    public void noCampFire() {
        System.out.println("fire camp not allowed");
    }

    @Override
    public void respectRestrictedArea() {
        System.out.println("restricted area");
    }

    @Override
    public void respectWildLife() {
        System.out.println("don't harm wild animals");
    }
}
