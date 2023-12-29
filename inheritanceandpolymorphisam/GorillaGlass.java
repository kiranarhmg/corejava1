class GorillaGlass extends LaminatedGlass
{
	GorillaGlass()
	{
								System.out.println("no-arg const of GorillaGlass");
	}
	GorillaGlass(String brand,String usage,float length,float thickness,GlassType type,double cost,int warranty)
	{
				super(brand,usage,length,thickness,type,cost,warranty);
						System.out.println("const of String,String,float,float,GlassType,double,int in GorillaGlass");
	}
}


