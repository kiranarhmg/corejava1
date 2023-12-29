class Helmet
{
	String brand;
	boolean safety;
	float weight;
	String type;
	double cost;
	
	Helmet()
	{
		System.out.println("Helmet brand : "+brand);
	}
	Helmet(String brand)
	{
		this();
		this.brand=brand;
		
		System.out.println("Helmet brand : "+brand);
	}
	Helmet(String brand,boolean safety)
	{
		this(brand);
		this.safety=safety;
		System.out.println("Helmet brand and safety: "+brand+" "+safety);
	}
	Helmet(String brand,boolean safety,float weight)
	{
		this(brand,safety);
		this.weight=weight;
		
		System.out.println("Helmet brand safety weight: "+brand+" "+safety+" "+weight);
	}
	Helmet(String brand,boolean safety,float weight,String type,double cost)
	{
		this(brand,safety,weight);
		this.cost=cost;
		this.type=type;
		System.out.println("Helmet brand safety weight type cost: "+brand+" "+safety+" "+weight+" "+type+""+cost);
	}
}
	
	
	
		