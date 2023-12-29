class TintedGlass extends ToughendGlass
{
	TintedGlass()
	{
						System.out.println("no-arg const of TintedGlass");
	}
	TintedGlass(String brand,String usage,float length,float thickness,GlassType type,float weight,String ownerName)
	{
				super(brand,usage,length,thickness,type,weight,ownerName);
	System.out.println("const of String,String,float,float,GlassType,float,String in TintedGlass");
	}
}


