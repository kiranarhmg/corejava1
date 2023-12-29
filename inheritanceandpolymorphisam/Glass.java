class Glass
{
	float length;
	float thickness;
	String usage;
	String brand;
	GlassType type;
	
	Glass()
	{
		System.out.println("no-arg const of glass");
	}
	
	Glass(String brand,String usage,float length,float thickness,GlassType type)
	{
		this.brand=brand;
		this.usage=usage;
		this.length=length;
		this.thickness=thickness;
		this.type=type;
	System.out.println("const of String,String,float,float,GlassType in Glass");

	}
}

	