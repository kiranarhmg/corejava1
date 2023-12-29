class TruckStarter
{
	public static void main(String[] any)
	{
		
		Truck truck=new Truck();
		Truck truck1=new Truck(6,2,6,4,"pavan");
		truck1.setProperties("ashokaleyland",4500000d,100000d,200000d,22.3f);

		truck1.carryStone();
		truck1.carrySand();
		truck1.carryCement();
		truck1.carryTank();
		truck1.carryCeramics();
		truck1.fireFight();
		truck1.carryLiveStock();
		truck1.carryFuel();
		truck1.carryFurniture();
		truck1.usedAsTowTruck();
		truck1.carryLoggs();
  System.out.println("noOfDoors : "+truck1.noOfDoors);
  System.out.println("noOfWheels : "+truck1.noOfWheels);
  System.out.println("noOfGears : "+truck1.noOfGears);
  System.out.println("noOfSeats : "+truck1.noOfSeats);
  System.out.println("owner : "+truck1.owner);
  System.out.println("company : "+truck1.company);
   System.out.println("cost : "+truck1.cost);
  System.out.println("carryCapacity : "+truck1.carryCapacity);
  System.out.println("truckWeight : "+truck1.truckWeight);
  System.out.println("truckHeight : "+truck1.truckHeight);

		System.out.println("************************************************************************");
		
		AshokaLeyland ashoka=new AshokaLeyland();
		AshokaLeyland ashoka1=new AshokaLeyland(10,2,6,4,"kumar",2621,"ecomate");
		ashoka1.setDetails("ashokaleyland",4500000d,100000d,200000d,22.3f);
		ashoka1.carryCylinders();
		ashoka1.carryGarbage();
		ashoka1.usedAsSnowPlow();
		ashoka1.carryStone();
		ashoka1.carrySand();
		ashoka1.carryCement();
		ashoka1.carryTank();
		ashoka1.carryCeramics();
		ashoka1.fireFight();
		ashoka1.carryLiveStock();
		ashoka1.carryFuel();
		ashoka1.carryFurniture();
		ashoka1.usedAsTowTruck();
		ashoka1.carryLoggs();
  System.out.println("noOfDoors : "+ashoka1.noOfDoors);
  System.out.println("noOfWheels : "+ashoka1.noOfWheels);
  System.out.println("noOfGears : "+ashoka1.noOfGears);
  System.out.println("noOfSeats : "+ashoka1.noOfSeats);
  System.out.println("owner : "+ashoka1.owner);
  System.out.println("chassiNo : "+ashoka1.chassiNo);
  System.out.println("model : "+ashoka1.model);
  System.out.println("company : "+ashoka1.company);
   System.out.println("cost : "+ashoka1.cost);
  System.out.println("carryCapacity : "+ashoka1.carryCapacity);
  System.out.println("truckWeight : "+ashoka1.truckWeight);
  System.out.println("truckHeight : "+ashoka1.truckHeight);










		
	}
}
