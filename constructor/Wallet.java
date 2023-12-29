class Wallet
{
	String brand;
	int price;
	String color;
	String type;
	
	Wallet()
	{
		super();
		System.out.println("Wallet brand: "+brand);
	}
	Wallet(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("Wallet brand: "+brand);
	}
	Wallet(String brand,int price)
	{
		super();
		this.brand=brand;
		this.price=price;
		System.out.println("Wallet brand and price: "+brand+" "+price);
	}
	Wallet(int price,String color)
	{
		super();
		this.color=color;
		this.price=price;
		System.out.println("Wallet color and price: "+color+" "+price);
	}
	Wallet(String brand,int price,String type)
	{
		super();
		this.brand=brand;
		this.price=price;
		this.type=type;
		System.out.println("Wallet brand price and color: "+brand+" "+price+" "+type);
	}
}
	
	
	