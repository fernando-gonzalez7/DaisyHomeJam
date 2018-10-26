package Worlds;
import Game.Entities.Creatures.*;
import Game.Entities.Statics.Rock;
import Main.Handler;


public class World3 extends BaseWorld{
	private Handler handler;
	private Player player;

	public World3(Handler handler, String path, Player player) {
		super(handler,path,player);
		this.handler = handler;
		this.player=player;

		//Stuff in the World go here
		entityManager.addEntity(new Rock(handler, 75, 370));

	}
}