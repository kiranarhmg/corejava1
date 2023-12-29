class MediaPlayer extends StandAloneApplication
{
	String[] favorites;
	MediaPlayer()
	{
				System.out.println("no-argument const of MediaPlayer");
	}
	
	MediaPlayer(int size,String compatibaleWith,OsType os,int id,String name,float version,String developer,String date,AppType type,String[] favorites)
	{
		super(size,compatibaleWith,os,id,name,version,developer,date,type);
		this.favorites=favorites;
	}
	void play()
	{
		System.out.println("play MediaPlayer");
	}
	void delete()
	{
		System.out.println("delete MediaPlayer");
	}
	void download()
	{
		System.out.println("download MediaPlayer");
	}
	void showDataInfo()
	{
		for(int seq=0;seq<favorites.length;seq++)
		{
			System.out.println("favorites : "+favorites[seq]);
		}
		
	}
		

		
}