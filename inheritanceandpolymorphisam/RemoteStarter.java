class RemoteStarter
{
	public static void main(String[] any)
	{
		LgRemote lgRemote=new LgRemote();
		LgRemote lgRemote1=new LgRemote(2,2,30,true,RemoteUsedFor.CHANGECHANNEL);
           lgRemote1.on();
		   lgRemote1.off();
		   lgRemote1.voiceCommand();
		   lgRemote1.increaseVolume();
		   lgRemote1.decreaseVolume();
		   System.out.println("total buttons : "+lgRemote1.totalButtons);
		   System.out.println("original : "+lgRemote1.original);
		   System.out.println("usedFor : "+lgRemote1.usedFor);
		   System.out.println("warranty : "+lgRemote1.warranty);
		   System.out.println("totalBatteries : "+lgRemote1.totalBatteries);
		  
		   
		   Remote remote=new Remote(25,true,RemoteUsedFor.CHANGECHANNEL);
		   remote.on();
		   remote.off();
		   		   System.out.println("total buttons : "+remote.totalButtons);

	}
}



		   
