package com.xworkz.place.kiran;

public class CourtRuleImp implements CourtRule{

    @Override
    public void obeyCourtOrder() {
        System.out.println("should obey court order");
    }

    @Override
    public void respectCourt() {
        System.out.println("respect court order");
    }

    @Override
    public void noMissBehave() {
        System.out.println("should not miss behave");
    }

    @Override
    public void arriveOnTime() {
        System.out.println("should come in time");
    }
}
