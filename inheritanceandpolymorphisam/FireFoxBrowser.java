class FireFoxBrowser extends Browser
{
	@Override
	void settings()
	{
		System.out.println("browser settings in FireFoxBrowser");
	}
	@Override
	void displayHistory()
	{
		System.out.println("browser displayHistory in FireFoxBrowser");
	}
	@Override
	void consumerMemory()
	{
		System.out.println("starts to consume Memory in FireFoxBrowser");
	}
	@Override
	void consumeInternet()
	{
		System.out.println("starts to consume internet in FireFoxBrowser");
	}
}
