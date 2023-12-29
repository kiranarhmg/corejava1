class MakeUpKit
{
	String brand;
	int price;
	String color;
	boolean quality;
	
	MakeUpKit()
	{
		super();
		System.out.println("MakeUpKit brand: "+brand);
	}
	MakeUpKit(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("MakeUpKit brand: "+brand);
	}
	MakeUpKit(String brand,int price)
	{
		super();
		this.brand=brand;
		this.price=price;
		System.out.println("MakeUpKit brand and price: "+brand+" "+price);
	}
	MakeUpKit(String color,boolean quality)
	{
		super();
		this.color=color;
		this.quality=quality;
		System.out.println("MakeUpKit color and rating: "+color+" "+quality);
	}
	MakeUpKit(String brand,int price,boolean quality)
	{
		super();
		this.brand=brand;
		this.price=price;
		this.quality=quality;
		System.out.println("MakeUpKit brand price and quality: "+brand+" "+price+" "+quality);
	}
}
	
	
	