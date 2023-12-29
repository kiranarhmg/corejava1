class Agent
{
	
	int id=1;
	String name="pavan";
	String company="srk";
	Tent tent;
	
	void openTent(Tent tent)
	{
		System.out.println("openTent in agent");

		this.tent=tent;
		for(int i=0;i<tent.color.length;i++)
		{
		System.out.println("color is "+tent.color[i]);
		}
		tent.open();
		tent.close();
		
		
	}
	void closeTent(Tent tent)
	{
				System.out.println("closeTent in agent");

		this.tent=tent;
		tent.open();
		tent.close();
		
	}
	void showInfo()
	{
		tent.showInfo();
		System.out.println("agent id "+id);
		System.out.println("agent name "+name);
		System.out.println("agent company "+company);


}

}

	
		
	