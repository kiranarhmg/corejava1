class ResultStarter
{
	public static void main(String[] any)
	{
		Tent tent=new Tent(1,20,30);
		Agent agent=new Agent();
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
		
		Game game=new Game();
		Player play=new Player(game);
		
	}
}