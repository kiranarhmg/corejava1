class Hotel
{
	String name;
	String ownwrName;
	MenuCard menuCard;
	
	void setDetails(String name,String ownwrName,MenuCard menuCard)
	{
		this.name=name;
		this.ownwrName=ownwrName;
		this.menuCard=menuCard;
	}
	void showInfo()
	{
		System.out.println("hotel name: "+name);
				System.out.println("hotel ownwrName: "+ownwrName);
						System.out.println("menuCard tota items: "+menuCard.totalItems);
        						System.out.println("menuCard cost: "+menuCard.cost+"\n");
	}
}


	