class Application{
	int id;
	String name;
	AppType type;
	float version;
	String developer;
	String date;
	
	Application()
	{
		System.out.println("no-argument const of Application");
	}
	Application(int id,String name,float version,String developer,String date,AppType type)
	{
		this.id=id;
		this.name=name;
		this.version=version;
		this.developer=developer;
		this.date=date;
		this.type=type;
	}
	void run()
	{
				System.out.println("Application running");
				stop();
	}
	void stop()
	{
		System.out.println("Application stoping");
		execute();
	}
	void execute()
	{
		System.out.println("Application starts its execution");
		collectInfo();
	}
	void collectInfo()
	{
		System.out.println("Application started to collectInfo");
		displayInfo();
	}
	void displayInfo()
	{
		System.out.println("id: "+this.id);
		System.out.println("name: "+this.name);
		System.out.println("version: "+this.version);
		System.out.println("developer: "+this.developer);
		System.out.println("date: "+this.date);
		System.out.println("type: "+this.type);
	}
}






		

