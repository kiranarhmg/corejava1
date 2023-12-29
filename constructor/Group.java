class Group{
	public static void main(String [] any)
	{
		System.out.println("starting of main method");
		Clock clock=new Clock();
		Clock clock1=new Clock("fastrack");
		Clock clock2=new Clock("fastrack",1200);
		Clock clock3=new Clock("black",5.5f);
		Clock clock4=new Clock("fastrack",1200,"black");
		System.out.println("\n");
		
		Wallet wallet=new Wallet();
		Wallet wallet1=new Wallet("wrogn");
		Wallet wallet2=new Wallet("wrogn",1500);
		Wallet wallet3=new Wallet(1500,"black");
		Wallet wallet4=new Wallet("wrogn",1500,"leather");
		System.out.println("\n");
		
		MakeUpKit makeUpKit=new MakeUpKit();
		MakeUpKit makeUpKit1=new MakeUpKit("himalaya");
		MakeUpKit makeUpKit2=new MakeUpKit("himalaya",200);
		MakeUpKit makeUpKit3=new MakeUpKit("white",true);
		MakeUpKit makeUpKit4=new MakeUpKit("himalaya",200,true);
		System.out.println("\n");
		
		Rocket rocket=new Rocket();
		Rocket rocket1=new Rocket("agni");
		Rocket rocket2=new Rocket(150000.45,"india");
		Rocket rocket3=new Rocket(15000,150000.45);
		Rocket rocket4=new Rocket("agni","india",15000);
		System.out.println("\n");
		
		Ornament ornament=new Ornament();
		Ornament ornament1=new Ornament("gold");
		Ornament ornament2=new Ornament(10.10,"ring");
		Ornament ornament3=new Ornament(true,"gold");
		Ornament ornament4=new Ornament("gold",true,10.10);
		System.out.println("\n");
		
		
		
	}
}
		