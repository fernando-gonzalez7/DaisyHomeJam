package Worlds;
import java.awt.Graphics;

import Game.Entities.Creatures.*;
import Game.Entities.Statics.*;
import Game.GameStates.State;
import Main.Handler;
import Resources.Images;


public class World3 extends BaseWorld{
	private Handler handler;
	private Player player;

	public World3(Handler handler, String path, Player player) {
		super(handler,path,player);
		this.handler = handler;
		this.player=player;

		//Stuff in the World go here
		entityManager.addEntity(new FirePillar(handler, 500, 500));
		entityManager.addEntity(new LuigiBlock(handler, 100, 100));
		
		


  }
	@Override
	public void tick() {
		entityManager.tick();
		itemManager.tick();
		
		if (Player.luigisummon == true) {
			entityManager.addEntity(new LuigiCompanion (handler, handler.getWorld().getEntityManager().getPlayer().getX()+30, 
					handler.getWorld().getEntityManager().getPlayer().getY()+30));
			Player.luigisummon = false;
		}
		
		 countP++;
	        if(countP>=30){
	            countP=30;
	        }

	        if(handler.getKeyManager().pbutt && countP>=30){
	            handler.getMouseManager().setUimanager(null);
	            countP=0;
	            State.setState(handler.getGame().pauseState);
	        }
		
	}

}