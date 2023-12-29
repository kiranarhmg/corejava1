class Ornament
{
	String name;
	double weight;
	String type;
	boolean quality;
	
	Ornament()
	{
		super();
		System.out.println("Ornament name: "+name);
	}
	Ornament(String name)
	{
		super();
		this.name=name;
		System.out.println("Ornament name: "+name);
	}
	Ornament(double weight,String type)
	{
		super();
		this.type=type;
		this.weight=weight;
		System.out.println("Ornament weight and type: "+weight+" "+type);
	}
	Ornament(boolean quality,String name)
	{
		super();
		this.quality=quality;
		this.name=name;
		System.out.println("Ornament quality and name: "+quality+" "+name);
	}
	Ornament(String name,boolean quality,double weight)
	{
		super();
		this.name=name;
		this.quality=quality;
		this.weight=weight;
		System.out.println("Ornament name quality and weight: "+name+" "+quality+" "+weight);
	}
}
	
	
	