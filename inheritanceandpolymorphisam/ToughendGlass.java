class ToughendGlass extends Glass
{
	float weight;
	String ownerName;
	ToughendGlass()
	{
				System.out.println("no-arg const of ToughendGlass");
	}
	
	ToughendGlass(String brand,String usage,float length,float thickness,GlassType type,float weight,String ownerName)
	{
		super(brand,usage,length,thickness,type);
		this.weight=weight;
		this.ownerName=ownerName;
		System.out.println("const of String,String,float,float,GlassType,float,String in ToughendGlass");

	}
}