class Bracelet
{
	String color;
	String designName;
	float weight;
	String type;
	double cost;
	
	Bracelet()
	{
		System.out.println("Bracelet color : "+color);
	}
	Bracelet(String color)
	{
		this();
		this.color=color;
		
		System.out.println("Bracelet color : "+color);
	}
	Bracelet(String color,String designName)
	{
		this(color);
		this.designName=designName;
		System.out.println("Bracelet color and designName: "+color+" "+designName);
	}
	Bracelet(String color,String designName,float weight)
	{
		this(color,designName);
		this.weight=weight;
		
		System.out.println("Bracelet color designName weight: "+color+" "+designName+" "+weight);
	}
	Bracelet(String color,String designName,float weight,String type,double cost)
	{
		this(color,designName,weight);
		this.cost=cost;
		this.type=type;
		System.out.println("Bracelet color designName weight type cost: "+color+" "+designName+" "+weight+" "+type+""+cost);
	}
}
	
	
	
		