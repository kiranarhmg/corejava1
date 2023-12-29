class Remote{
	int totalButtons;
	boolean original;
	RemoteUsedFor usedFor;
	
	Remote()
	{
		System.out.println("no-arg const of Remote");
	}
	Remote(int totalButtons,boolean original, RemoteUsedFor usedFor)
	{
		this.totalButtons=totalButtons;
		this.original=original;
		this.usedFor=usedFor;
	}
	void on()
	{
				System.out.println("remote is used to on tv");
	}
	
	void off()
	{
						System.out.println("remote is used to off tv");
	}
	void increaseVolume()
	{
								System.out.println("remote is used to increaseVolume of tv");
	}
	void decreaseVolume()
	{
								System.out.println("remote is used to decreaseVolume of tv");
	}
	void changeChannel()
	{
								System.out.println("remote is used to changeChannel of tv");
	}
}


		


