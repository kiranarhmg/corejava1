package com.xworkz.collection.collectionExample.parking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Setter
@Getter
@AllArgsConstructor
public class ParkingDTO implements Serializable {
    int parkingAreaSize;
    int parkingNo;
    String parkingName;
    int noOfVehiclePark;
}
