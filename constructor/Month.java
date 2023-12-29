class Month
{
	String name;
	int  noOfDays;
	int noOfWeekend;
	int noOfHolidays;
	
	
	Month(String name,int noOfDays,int noOfWeekend,int noOfHolidays)
	{
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeekend=noOfWeekend;
		this.noOfHolidays=noOfHolidays;
	}
	
	void display()
	{
		System.out.println("month name: "+name);
				System.out.println("noOfDays: "+noOfDays);
						System.out.println("noOfWeekend: "+noOfWeekend);
       						System.out.println("noOfHolidays: "+noOfHolidays);

	}
}