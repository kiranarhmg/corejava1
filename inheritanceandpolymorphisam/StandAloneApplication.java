class StandAloneApplication extends Application
{
	int size;
	String compatibaleWith;
	OsType os;
	StandAloneApplication()
	{
				System.out.println("no-argument const of StandAloneApplication");

	}
	
	StandAloneApplication(int size,String compatibaleWith,OsType os,int id,String name,float version,String developer,String date,AppType type)
	{
		super(id,name,version,developer,date,type);
		this.size=size;
		this.compatibaleWith=compatibaleWith;
		this.os=os;
	}
	void consumerMemory()
	{
		System.out.println("starts to consume Memory");
	}
	void consumeInternet()
	{
		System.out.println("starts to consume internet");
	}
	

	void show()
	{
				System.out.println("size: "+size);
				System.out.println("compatibaleWith: "+compatibaleWith);
				System.out.println("os: "+os);
	}
}


				

		
