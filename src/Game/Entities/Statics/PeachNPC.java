package Game.Entities.Statics;

import Game.Entities.Creatures.Player;
import Game.GameStates.State;
import Game.Items.Item;
import Main.Handler;
import Resources.Images;
import Worlds.BaseWorld;

import java.awt.*;
import java.awt.event.KeyEvent;



public class PeachNPC extends StaticEntity {

	//Phase 4
	public static Boolean questComplete1 = false;
	boolean coins3Delivered;
	boolean key1Delivered;
	
    private Rectangle ir = new Rectangle();
    public Boolean EP = false;

    private BaseWorld world;

    public PeachNPC(Handler handler, float x, float y,BaseWorld world) {
        super(handler, x, y, 94, 48);
        this.world=world;
        health=10000000;
        bounds.x=6;
        bounds.y=44;
        bounds.width = 40;
        bounds.height = 52;

        ir.width = bounds.width;
        ir.height = bounds.height;
        int irx=(int)(bounds.x-handler.getGameCamera().getxOffset()+x);
        int iry= (int)(bounds.y-handler.getGameCamera().getyOffset()+height);
        ir.y=iry;
        ir.x=irx;
    }

    @Override
    public void tick() {

        if(isBeinghurt()){
            setHealth(10000000);
        }

        if(handler.getKeyManager().attbut){
            EP=true;

        }else if(!handler.getKeyManager().attbut){
            EP=false;
        }

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.princesspeach[0],(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);

        g.setColor(Color.black);
        checkForPlayer(g, handler.getWorld().getEntityManager().getPlayer());
    }


    private void checkForPlayer(Graphics g, Player p)
    {

        Rectangle pr = p.getCollisionBounds(0,44);

        //TODO
        //Interaction with player code
        
        //If E is not pressed display that an action is available
        if(ir.contains(pr) && !EP)
        {
            g.drawImage(Images.E,(int) x+width,(int) y+10,32,32,null);
            System.out.println("Contact successful");
        }
        //If E is pressed then 
        else if(ir.contains(pr) && EP)
        {
			for (Item m: handler.getWorld().getEntityManager().getPlayer().getInventory().getInventoryItems())
			{
				System.out.println("For loop entered.");
				if (m.getName().equals("Coin"))
				{
					if (m.getCount() >= 3)
					{
						m.setCount(m.getCount() - 3);
						coins3Delivered = true;
					}
				}
				if (m.getName().equals("World-1 Key"))
				{
					if (m.getCount() >= 1)
					{
						m.setCount(m.getCount() - 1);
						key1Delivered = true;
					}
				}
			}
			if (coins3Delivered && key1Delivered)
			{
				g.drawImage(Images.EP,(int) x+width,(int) y+10,32,32,null);
				System.out.println("Quest completed successful");
				//boolean questComplete1 = true;
			}
        }
    }


    @Override
    public void die() {

    }
}