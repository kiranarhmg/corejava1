class Free
{
	String what;
	String why;
	String freeForAll;
	
	Free(String what,String why,String freeForAll)
	{
		this.what=what;
		this.why=why;
		this.freeForAll=freeForAll;
	}
	
	void display()
	{
		System.out.println("free what: "+what);
				System.out.println("free why: "+why);
						System.out.println("free freeForAll: "+freeForAll);
	}
}