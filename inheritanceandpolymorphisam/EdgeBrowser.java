class EdgeBrowser extends Browser
{
	@Override
	void settings()
	{
		System.out.println("browser settings in edgeBrowser");
	}
	@Override
	void displayHistory()
	{
		System.out.println("browser displayHistory in edgeBrowser");
	}
	@Override
	void consumerMemory()
	{
		System.out.println("starts to consume Memory in edgeBrowser");
	}
	@Override
	void consumeInternet()
	{
		System.out.println("starts to consume internet in edgeBrowser");
	}
}
