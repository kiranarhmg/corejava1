class LgRemote extends Remote
{
	int warranty;
	int totalBatteries;
	
	LgRemote()
	{
				System.out.println("no-arg const of LgRemote");
	}
	
	LgRemote(int warranty,int totalBatteries,int totalButtons,boolean original, RemoteUsedFor usedFor)
	{
		super(totalButtons,original,usedFor);
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
						System.out.println("const of int,int,int,boolean,RemoteUsedFor in LgRemote");
	}
	void voiceCommand()
	{
						System.out.println("voiceCommand is used to change voice");
	}
	
	@Override
	void on()
	{
						System.out.println("LgRemote is used to on Lgtv");
	}
    @Override
	void off()
	{
						System.out.println("LgRemote is used to off Lgtv");
	}
}

