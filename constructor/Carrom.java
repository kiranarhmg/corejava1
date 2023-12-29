class Carrom
{
	int totalCoin;
	int blackCoin;
	int wightCoin;
	String queenColor;
	float coinMass;
	
	Carrom()
	{
		System.out.println("Carrom queenColor : "+queenColor);
	}
	Carrom(String queenColor)
	{
		this();
		this.queenColor=queenColor;
		
		System.out.println("Carrom queenColor: "+queenColor);
	}
	Carrom(String queenColor,int totalCoin)
	{
		this(queenColor);
		this.totalCoin=totalCoin;
		System.out.println("Carrom queenColor and totalCoin: "+queenColor+" "+totalCoin);
	}
	Carrom(String queenColor,int totalCoin,int blackCoin)
	{
		this(queenColor,totalCoin);
		this.blackCoin=blackCoin;
		
		System.out.println("Carrom queenColor and totalCoin blackCoin: "+queenColor+" "+totalCoin+" "+blackCoin);
	}
	Carrom(String queenColor,int totalCoin,int blackCoin,int wightCoin,float coinMass)
	{
		this(queenColor,totalCoin,blackCoin);
		this.wightCoin=wightCoin;
		this.coinMass=coinMass;
		System.out.println("Carrom queenColor and totalCoin blackCoin wightCoin coinMass: "+queenColor+" "+totalCoin+" "+blackCoin+" "+wightCoin+" "+coinMass);
	}
}
	
	
	
		