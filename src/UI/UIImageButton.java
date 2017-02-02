package UI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * Created by Elemental on 1/2/2017.
 */
public class UIImageButton extends UIObject{
    private BufferedImage[] images;
    private ClickListlener clicker;

    public UIImageButton(float x, float y, int width, int height, BufferedImage[] images,ClickListlener clicker ) {
        super(x, y, width, height);
        this.images=images;
        this.clicker=clicker;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        if(active){
            g.drawImage(images[2],(int)x,(int)y,width,heith,null);
        }
        else if(hovering){
            g.drawImage(images[1],(int)x,(int)y,width,heith,null);
        }else{
            g.drawImage(images[0],(int)x,(int)y,width,heith,null);

        }
    }


    @Override
    public void onClick()
    {
        clicker.onClick();
    }
}