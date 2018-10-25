package Game.Entities.Statics;

import Resources.Images;
import Main.Handler;

import java.awt.*;


public class PeachNPC extends StaticEntity {
	
    public PeachNPC(Handler handler, float x, float y) {
        super(handler, x, y, 94, 48);

        bounds.x=6;
        bounds.y=44;
        bounds.width = 40;
        bounds.height = 52;
        health=16;
    }   
    
    @Override
    public void render(Graphics g) {
        g.drawImage(Images.princesspeach[0],(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);

    }

	@Override
	public void tick() {
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
}