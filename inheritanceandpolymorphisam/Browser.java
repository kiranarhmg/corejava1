class Browser extends StandAloneApplication
{
	String[] downloads;
	String[] browsingHistorySites;
	Browser()
	{
				System.out.println("no-argument const of Browser");

	}
	
	Browser(int size,String compatibaleWith,OsType os,int id,String name,float version,String developer,String date,AppType type,String[] downloads,String[] browsingHistorySites)
	{
		super(size,compatibaleWith,os,id,name,version,developer,date,type);
		this.downloads=downloads;
		this.browsingHistorySites=browsingHistorySites;
	}
	void settings()
	{
		System.out.println("browser settings");
	}
	void displayHistory()
	{
		System.out.println("browser displayHistory");
	}
	void showData()
	{
		for(int seq=0;seq<downloads.length;seq++)
		{
			System.out.println("downloads : "+downloads[seq]);
		}
		for(int seq=0;seq<downloads.length;seq++)
		{
			System.out.println("browsingHistorySites : "+browsingHistorySites[seq]);
		}
	}
		

		
}