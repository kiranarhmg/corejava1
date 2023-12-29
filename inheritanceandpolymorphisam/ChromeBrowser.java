class ChromeBrowser extends Browser
{
	
	@Override
	void settings()
	{
		System.out.println("browser settings in ChromeBrowser");
	}
	@Override
	void displayHistory()
	{
		System.out.println("browser displayHistory in ChromeBrowser");
	}
	@Override
	void consumerMemory()
	{
		System.out.println("starts to consume Memory in ChromeBrowser");
	}
	@Override
	void consumeInternet()
	{
		System.out.println("starts to consume internet in ChromeBrowser");
	}
}
