package com.xworkz.place.kiran;

public class Runner {
    public static void main(String[] args) {
        HostelRule hostelRule=new HostelRuleImp();
        hostelRule.allocateRoom();
        hostelRule.checkRoomAvailability();
        hostelRule.vacateRoom();
        hostelRule.studentDetails();
        System.out.println(HostelRule.hostelId);
        System.out.println(HostelRule.name);

        System.out.println("*********************************************************");
       HospitalRule hospitalRule=new HospitalRuleImp();
           hospitalRule.keepClean();
           hospitalRule.keepSilence();
           hospitalRule.maintainQue();
           hospitalRule.parking();
        System.out.println("hospital id: "+HospitalRule.hospitalId);
        System.out.println("hospital name: "+HospitalRule.hospitalName);
        System.out.println("*********************************************************");

        CourtRule courtRule=new CourtRuleImp();
        courtRule.arriveOnTime();
        courtRule.respectCourt();
        courtRule.noMissBehave();
        courtRule.noMissBehave();
        System.out.println(CourtRule.courtName);
        System.out.println(CourtRule.noOfJudges);

        System.out.println("*********************************************************");
ForestRule forestRule=new ForestRuleImp();
forestRule.noCampFire();
forestRule.noHunting();
forestRule.respectRestrictedArea();
forestRule.respectWildLife();
        System.out.println(ForestRule.forestName);
        System.out.println(ForestRuleImp.stateName);
        System.out.println("*********************************************************");
TempleRule templeRule=new TempleRuleImp();
templeRule.cameInQueue();
templeRule.keepClean();
templeRule.noPhoto();
templeRule.keepSilence();
        System.out.println(TempleRule.templeName);
        System.out.println(TempleRule.address);
    }
}
