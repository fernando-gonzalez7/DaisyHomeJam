package Game.Entities.Statics;

import Game.Entities.Creatures.Koopa;
import Game.Entities.Creatures.Player;
import Game.GameStates.State;
import Game.Items.Item;
import Main.Handler;
import Resources.Images;
import Worlds.BaseWorld;
import Worlds.CaveWorld;
import Worlds.World1;

import java.awt.*;
import java.awt.event.KeyEvent;

public class PeachNPC extends StaticEntity {

	//Phase 4
	public static boolean questComplete1 = false;
	public static boolean coins3Delivered = false;
	public static boolean key1Delivered = false;
	
    private Rectangle ir = new Rectangle();
    public Boolean EP = false;

    private BaseWorld world;

    public PeachNPC(Handler handler, float x, float y,BaseWorld world) {
        super(handler, x, y, 94, 48);
        this.world=world;
        health=10000000;
        bounds.x=0;
        bounds.y=0;
        bounds.width = 100;
        bounds.height = 64;

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

        Rectangle pr = p.getCollisionBounds(0,0);

        //Interaction with player code
        
        //If E is not pressed display that an action is available
        if(ir.contains(pr) && !EP)
        {
            g.drawImage(Images.E,(int) x+width,(int) y+10,32,32,null);
            //System.out.println("Contact successful");
        }
        //If E is pressed then 
        else if(ir.contains(pr) && EP)
        {
            //System.out.println("E pressed");
        	//TODO
        	//The image for the quest needs to be added here.
            
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
				//TODO
				//Image needs to be replaced
				g.drawImage(Images.EP,(int) x+width,(int) y+10,32,32,null);
				System.out.println("Quest completed successful");
				questComplete1 = true;
				//handler.getWorld().getEntityManager().addEntity(new Koopa(handler, 100, 100));
				//World1.setIsdoor(true);
				
			}
			else if(!coins3Delivered || !key1Delivered)
			{
				//TODO
				//Add images and dynamic numbers showing what items are still needed for the quest.
				System.out.println("Missing items for quest.");
			}
        }
    }


    @Override
    public void die() {

    }
}
