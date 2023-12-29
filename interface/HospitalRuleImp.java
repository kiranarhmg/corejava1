package com.xworkz.place.kiran;

public class HospitalRuleImp implements HospitalRule{
    @Override
    public void keepClean() {
        System.out.println("should maintain cleanliness");
    }

    @Override
    public void keepSilence() {
        System.out.println("don't make noise");
    }

    @Override
    public void parking() {
        System.out.println("park vehicles correctly");
    }

    @Override
    public void maintainQue() {
        System.out.println("don't make hurry came in queue");
    }
}
