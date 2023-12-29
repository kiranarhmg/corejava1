class KeyChain
{
	String madeIn;
	int height;
	int width;
	String type;
	double cost;
	
	KeyChain()
	{
		System.out.println("KeyChain madeIn : "+madeIn);
	}
	KeyChain(String madeIn)
	{
		this();
		this.madeIn=madeIn;
		
		System.out.println("KeyChain madeIn : "+madeIn);
	}
	KeyChain(String madeIn,int height)
	{
		this(madeIn);
		this.height=height;
		System.out.println("KeyChain madeIn height: "+madeIn+" "+height);
	}
	KeyChain(String madeIn,int height,int width)
	{
		this(madeIn,height);
		this.width=width;
		
		System.out.println("KeyChain madeIn height width: "+madeIn+" "+height+" "+width);
	}
	KeyChain(String madeIn,int height,int width,String type,double cost)
	{
		this(madeIn,height,width);
		this.cost=cost;
		this.type=type;
		System.out.println("KeyChain madeIn height width type cost: "+madeIn+" "+height+" "+width+" "+type+""+cost);
	}
}
	
	
	
		