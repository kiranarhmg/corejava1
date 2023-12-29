class Printer
{
	String brand;
	int manufacturedYear;
	int batchNo;
	String type;
	double cost;
	
	Printer()
	{
		System.out.println("Printer brand : "+brand);
	}
	Printer(String brand)
	{
		this();
		this.brand=brand;
		
		System.out.println("Printer brand : "+brand);
	}
	Printer(String brand,int manufacturedYear)
	{
		this(brand);
		this.manufacturedYear=manufacturedYear;
		
		System.out.println("Printer brand and manufacturedYear: "+brand+" "+manufacturedYear);
	}
	Printer(String brand,int batchNo,int manufacturedYear)
	{
		this(brand,manufacturedYear);
		this.batchNo=batchNo;
		
		System.out.println("Printer brand batchNo manufacturedYear: "+brand+" "+batchNo+" "+manufacturedYear);
	}
	Printer(String brand,int batchNo,int manufacturedYear,double cost)
	{
		this(brand,batchNo,manufacturedYear);
		this.cost=cost;
		
		System.out.println("Printer brand batchNo manufacturedYear cost: "+brand+" "+batchNo+" "+manufacturedYear+" "+cost);
	}
}
	
	
	
		