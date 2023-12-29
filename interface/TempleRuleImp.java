package com.xworkz.place.kiran;

public class TempleRuleImp implements TempleRule {
    @Override
    public void noPhoto() {
        System.out.println("taking photo not allowed");
    }

    @Override
    public void keepSilence() {
        System.out.println("maintain silence");
    }

    @Override
    public void keepClean() {
        System.out.println("maintain cleanness");
    }

    @Override
    public void cameInQueue() {
        System.out.println("should came in queue");
    }
}
