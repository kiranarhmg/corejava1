package com.xworkz.collection.collectionExample.parking;

import java.util.Comparator;

public class ParkingSizeComparatorAsc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getParkingAreaSize(), o2.getParkingAreaSize());
    }
}
class ParkingSizeComparatorDsc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o2.getParkingAreaSize(), o1.getParkingAreaSize());
    }
}
class ParkingNoComparatorAsc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getParkingNo(), o2.getParkingNo());
    }
}
class ParkingNoComparatorDsc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o2.getParkingNo(), o1.getParkingNo());
    }
}
class ParkingNameComparatorAsc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        int n=o1.getParkingName().compareTo(o2.getParkingName());
        return n;
    }
}
class ParkingNameComparatorDsc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        int n=o2.getParkingName().compareTo(o1.getParkingName());
        return n;
    }
}
class ParkingNoOfVehicleComparatorDsc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o2.getNoOfVehiclePark(), o1.getNoOfVehiclePark());
    }
}
class ParkingNoOfVehicleComparatorAsc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getNoOfVehiclePark(), o2.getNoOfVehiclePark());
    }
}
