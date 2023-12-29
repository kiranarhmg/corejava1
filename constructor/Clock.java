class Clock
{
	String brand;
	int price;
	String color;
	float rating;
	
	Clock()
	{
		super();
		System.out.println("clock brand: "+brand);
	}
	Clock(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("clock brand: "+brand);
	}
	Clock(String brand,int price)
	{
		super();
		this.brand=brand;
		this.price=price;
		System.out.println("clock brand and price: "+brand+" "+price);
	}
	Clock(String color,float rating)
	{
		super();
		this.color=color;
		this.rating=rating;
		System.out.println("clock color and rating: "+color+" "+rating);
	}
	Clock(String brand,int price,String color)
	{
		super();
		this.brand=brand;
		this.price=price;
		this.color=color;
		System.out.println("clock brand price and color: "+brand+" "+price+" "+color);
	}
}
	
	
	