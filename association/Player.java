class Player
{
	String name="uday";
	Game game;
	Player(Game game)
	{
		this.game=game;
		game.play();
		game.pauseGame();
		game.endGame();
		game.showInfo();
	}
}
	