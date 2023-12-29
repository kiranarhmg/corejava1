class WebApplication extends Application
{
	String[] supportedBrowser;
	boolean free;
	WebApplication()
	{
				System.out.println("no-argument const of WebApplication");
	}
	
	WebApplication(String[] supportedBrowser,boolean free,int id,String name,float version,String developer,String date,AppType type)
	{
		super(id,name,version,developer,date,type);
		this.supportedBrowser=supportedBrowser;
		this.free=free;
	}
	void connectInternet()
	{
		System.out.println("web application connected to internet");
	}
	void sendUsage()
	{
		System.out.println("web application sendUsage");
	}
	void showInfo()
	{
				for(int index=0;index<supportedBrowser.length;index++)
				{
					System.out.println("supportedBrowser: "+supportedBrowser[index]);
				}
				System.out.println("free: "+free);
	}
}



		
