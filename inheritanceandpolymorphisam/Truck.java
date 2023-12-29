class Truck
{
	int noOfWheels;
	String company;
	double cost;
	int noOfSeats;
	int noOfDoors;
	double carryCapacity;
	double truckWeight;
	float truckHeight;
	String owner;
	int noOfGears;
	
	Truck()
	{
		System.out.println("no-arg const of Truck");
	}
	Truck(int noOfWheels,int noOfDoors,int noOfGears,int noOfSeats,String owner)
	{
		this.noOfDoors=noOfDoors;
		this.noOfGears=noOfGears;
		this.noOfSeats=noOfSeats;
		this.noOfWheels=noOfWheels;
		this.owner=owner;
	}
	void setProperties(String company,double cost,double carryCapacity,double truckWeight,float truckHeight)
	{
		this.company=company;
		this.cost=cost;
		this.carryCapacity=carryCapacity;
		this.truckHeight=truckHeight;
		this.truckWeight=truckWeight;
	}
	void carryStone()
	{
		System.out.println("truck is used to carry stones");
	}
	void carrySand()
	{
		System.out.println("truck is used to carry sand");
	}
	void carryCement()
	{
				System.out.println("truck is used to carry cement");
	}
	void carryTank()
	{
				System.out.println("truck is used to carry water tank");
	}
	void carryCeramics()
	{
				System.out.println("truck is used to carry ceramics");
	}
	void fireFight()
	{
				System.out.println("truck is used in fireFight");
	}
	void carryLiveStock()
	{
				System.out.println("truck is used to carry live stock");
	}
	void carryFuel()
	{
				System.out.println("truck is used to carry fuel");
	}
	void carryFurniture()
	{
				System.out.println("truck is used to carry furniture");
	}
	void usedAsTowTruck()
	{
				System.out.println("truck is used to carry cars");
	}
	void carryLoggs()
	{
				System.out.println("truck is used to carry loggs");
	}


}