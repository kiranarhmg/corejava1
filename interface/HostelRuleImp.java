package com.xworkz.place.kiran;

public class HostelRuleImp implements HostelRule{
    @Override
    public void allocateRoom() {
        System.out.println("allocate room to student");
    }

    @Override
    public void checkRoomAvailability() {
        System.out.println("check room availability");
    }

    @Override
    public void vacateRoom() {
        System.out.println("vacate room");
    }

    @Override
    public void studentDetails() {
        System.out.println("student details ");
    }

}
