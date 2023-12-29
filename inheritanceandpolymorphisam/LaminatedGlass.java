class LaminatedGlass extends Glass
{
	double cost;
	int warranty;
	LaminatedGlass()
	{
				System.out.println("no-arg const of LaminatedGlass");
	}
	
	LaminatedGlass(String brand,String usage,float length,float thickness,GlassType type,double cost,int warranty)
	{
		super(brand,usage,length,thickness,type);
		this.cost=cost;
		this.warranty=warranty;
		System.out.println("const of String,String,float,float,GlassType,double,int in LaminatedGlass");

	}
}