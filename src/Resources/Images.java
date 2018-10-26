package Resources;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Elemental on 12/19/2016.
 */
public class Images {

	//Change default w/h to fit Mario
	private static final int width = 56, height = 74;    //Mario W/H

	private static final int iwidth = 32, iheight = 32;  //Item W/H

	private static final int Bwidth = 64, Bheight = 64;  //Tiles W/H
	private static final int Rwidth = 56, Rheight = 93;
	private static final int Fwidth = 512, Fheight = 197;

	public static BufferedImage[] blocks;

	//Mario Moving
	public static BufferedImage[] player_right;
	public static BufferedImage[] player_left;
	public static BufferedImage[] player_front;
	public static BufferedImage[] player_back;

	//Idle Mario Variables
	public static BufferedImage[] marioidle_right;
	public static BufferedImage[] marioidle_left;
	public static BufferedImage[] marioidle_front;
	public static BufferedImage[] marioidle_back;

	//Goomba
	public static BufferedImage[] goomba_right;
	public static BufferedImage[] goomba_left;
	public static BufferedImage[] goomba_front;
	public static BufferedImage[] goomba_back;

	//Koopa
	public static BufferedImage[] koopa_right;
	public static BufferedImage[] koopa_left;
	public static BufferedImage[] koopa_front;
	public static BufferedImage[] koopa_back;

	//Koopa
	public static BufferedImage[] drybones_right;
	public static BufferedImage[] drybones_left;
	public static BufferedImage[] drybones_front;
	public static BufferedImage[] drybones_back;

	//Chain Chomp
	public static BufferedImage[] chain_right;
	public static BufferedImage[] chain_left;
	public static BufferedImage[] chain_front;
	public static BufferedImage[] chain_back;

	//Princess Peach
	public static BufferedImage[] princesspeach;

	public static BufferedImage[] butstart;
	public static BufferedImage[] particleSmoke;
	public static BufferedImage[] items;
	public static BufferedImage[] numbers;
	public static BufferedImage inventory;
	public static BufferedImage title;
	public static BufferedImage door;
	public static BufferedImage E;
	public static BufferedImage EP;
	public static BufferedImage Pause;
	public static BufferedImage[] Resume;
	public static BufferedImage[] BTitle;
	public static BufferedImage[] Options;
	public static BufferedImage[] Runes;
	public static ImageIcon icon;
	public static BufferedImage[] FireBallLeft;
	public static BufferedImage[] FireBallRight;
	public static BufferedImage[] FireBallUp;
	public static BufferedImage[] FireBallDown;
	public static BufferedImage loading;
	public static BufferedImage spellGUI;

	public static BufferedImage[] fountain;
	public static BufferedImage[] drystatue;


	public Images() {

		SpriteSheet newsheet = new SpriteSheet(Images.loadImage("/Sheets/SpriteSheet.png"));
		SpriteSheet numsheet = new SpriteSheet(Images.loadImage("/Sheets/NumberSheet.png"));
		SpriteSheet runesheet = new SpriteSheet(Images.loadImage("/Sheets/runes.png"));
		SpriteSheet FireBallsheet = new SpriteSheet(Images.loadImage("/Sheets/FireBall.png"));
		SpriteSheet FireBallRightsheet = new SpriteSheet(Images.loadImage("/Sheets/FireBallRight.png"));
		SpriteSheet FireBallUpsheet = new SpriteSheet(Images.loadImage("/Sheets/FireBallUp.png"));
		SpriteSheet FireBallDownsheet = new SpriteSheet(Images.loadImage("/Sheets/FireBallDown.png"));

		//Added sheets:
		SpriteSheet mariorun = new SpriteSheet(Images.loadImage("/Sheets/MarioSheet.png"));
		SpriteSheet goombasheet = new SpriteSheet(Images.loadImage("/Sheets/GoombaSheet.png"));
		SpriteSheet peachtiles = new SpriteSheet(Images.loadImage("/Sheets/PeachTiles.png"));
		SpriteSheet inventorysheet = new SpriteSheet(Images.loadImage("/Sheets/InventoryItems.png"));
		SpriteSheet fountainsheet = new SpriteSheet(Images.loadImage("/Sheets/FountainSheet.png"));
		SpriteSheet statuesheet = new SpriteSheet(Images.loadImage("/Sheets/StatueSheet.png"));
		SpriteSheet npcsheet = new SpriteSheet(Images.loadImage("/Sheets/NPCSheet.png"));
		SpriteSheet koopasheet = new SpriteSheet(Images.loadImage("/Sheets/KoopaSheet.png"));
		SpriteSheet deserttiles = new SpriteSheet(Images.loadImage("/Sheets/DesertTiles.png"));
		SpriteSheet drybonesstatue = new SpriteSheet(Images.loadImage("/Sheets/DryBonesStatue.png"));
		SpriteSheet chainchompsheet = new SpriteSheet(Images.loadImage("/Sheets/ChainChompSheet.png"));
		SpriteSheet drybonessheet = new SpriteSheet(Images.loadImage("/Sheets/DryBonesSheet.png"));


		blocks = new BufferedImage[256];

		//Changed values

		player_left = new BufferedImage[8];
		player_right = new BufferedImage[8];
		player_front = new BufferedImage[8];
		player_back = new BufferedImage[8];

		//Added these
		marioidle_left = new BufferedImage[1];
		marioidle_right = new BufferedImage[1];
		marioidle_front = new BufferedImage[1];
		marioidle_back = new BufferedImage[1];


		goomba_left = new BufferedImage[8];
		goomba_right = new BufferedImage[8];
		goomba_front = new BufferedImage[8];
		goomba_back = new BufferedImage[8];

		//Koopa
		koopa_left = new BufferedImage[8];
		koopa_right = new BufferedImage[8];
		koopa_front = new BufferedImage[8];
		koopa_back = new BufferedImage[8];

		//Dry Bones
		drybones_left = new BufferedImage[8];
		drybones_right = new BufferedImage[8];
		drybones_front = new BufferedImage[8];
		drybones_back = new BufferedImage[8];

		//Chain
		chain_left = new BufferedImage[4];
		chain_right = new BufferedImage[4];
		chain_front = new BufferedImage[4];
		chain_back = new BufferedImage[4];


		//Peach
		princesspeach = new BufferedImage[4];

		butstart = new BufferedImage[3];
		particleSmoke = new BufferedImage[3];
		items = new BufferedImage[256];
		numbers = new BufferedImage[21];
		Resume = new BufferedImage[2];
		BTitle = new BufferedImage[2];
		Options = new BufferedImage[2];
		Runes = new BufferedImage[36];

		//Fountain
		fountain = new BufferedImage[3];

		drystatue = new BufferedImage[6];

		FireBallLeft = new BufferedImage[6];
		FireBallRight = new BufferedImage[6];
		FireBallUp = new BufferedImage[6];
		FireBallDown = new BufferedImage[6];




		try {

			loading = ImageIO.read(getClass().getResourceAsStream("/Sheets/loading.png"));
			spellGUI = ImageIO.read(getClass().getResourceAsStream("/Sheets/SpellGUI.png"));

			inventory = ImageIO.read(getClass().getResourceAsStream("/Sheets/guit.png"));
			title = ImageIO.read(getClass().getResourceAsStream("/Sheets/NewMenu.png"));

			//New Door
			door = peachtiles.crop(2,216,80,84);

			E = ImageIO.read(getClass().getResourceAsStream("/Buttons/E.png"));
			EP = ImageIO.read(getClass().getResourceAsStream("/Buttons/EP.png"));
			Pause = ImageIO.read(getClass().getResourceAsStream("/Buttons/Pause.png"));
			Resume[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Resume.png"));
			Resume[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/ResumeP.png"));
			BTitle[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitle.png"));
			BTitle[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitleP.png"));
			Options[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Options.png"));
			Options[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/OptionsP.png"));

			//icon
			icon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/Sheets/MushroomIcon.png")));

			//fireball left
			FireBallLeft[0]= FireBallsheet.crop(Fwidth*0,Fheight*0,Fwidth,Fheight);
			FireBallLeft[1]= FireBallsheet.crop(Fwidth*1,Fheight*0,Fwidth,Fheight);
			FireBallLeft[2]= FireBallsheet.crop(Fwidth*2,Fheight*0,Fwidth,Fheight);
			FireBallLeft[3]= FireBallsheet.crop(Fwidth*0,Fheight*1,Fwidth,Fheight);
			FireBallLeft[4]= FireBallsheet.crop(Fwidth*1,Fheight*1,Fwidth,Fheight);
			FireBallLeft[5]= FireBallsheet.crop(Fwidth*2,Fheight*1,Fwidth,Fheight);

			//fireball right
			FireBallRight[0]= FireBallRightsheet.crop(Fwidth*0,Fheight*0,Fwidth,Fheight);
			FireBallRight[1]= FireBallRightsheet.crop(Fwidth*1,Fheight*0,Fwidth,Fheight);
			FireBallRight[2]= FireBallRightsheet.crop(Fwidth*2,Fheight*0,Fwidth,Fheight);
			FireBallRight[3]= FireBallRightsheet.crop(Fwidth*0,Fheight*1,Fwidth,Fheight);
			FireBallRight[4]= FireBallRightsheet.crop(Fwidth*1,Fheight*1,Fwidth,Fheight);
			FireBallRight[5]= FireBallRightsheet.crop(Fwidth*2,Fheight*1,Fwidth,Fheight);

			//fireball up
			FireBallUp[0]= FireBallUpsheet.crop(Fheight*1,Fwidth*0,Fheight,Fwidth);
			FireBallUp[1]= FireBallUpsheet.crop(Fheight*1,Fwidth*1,Fheight,Fwidth);
			FireBallUp[2]= FireBallUpsheet.crop(Fheight*1,Fwidth*2,Fheight,Fwidth);
			FireBallUp[3]= FireBallUpsheet.crop(Fheight*0,Fwidth*0,Fheight,Fwidth);
			FireBallUp[4]= FireBallUpsheet.crop(Fheight*0,Fwidth*1,Fheight,Fwidth);
			FireBallUp[5]= FireBallUpsheet.crop(Fheight*0,Fwidth*2,Fheight,Fwidth);

			//fireball down
			FireBallDown[0]= FireBallDownsheet.crop(Fheight*1,Fwidth*0,Fheight,Fwidth);
			FireBallDown[1]= FireBallDownsheet.crop(Fheight*1,Fwidth*1,Fheight,Fwidth);
			FireBallDown[2]= FireBallDownsheet.crop(Fheight*1,Fwidth*2,Fheight,Fwidth);
			FireBallDown[3]= FireBallDownsheet.crop(Fheight*0,Fwidth*0,Fheight,Fwidth);
			FireBallDown[4]= FireBallDownsheet.crop(Fheight*0,Fwidth*1,Fheight,Fwidth);
			FireBallDown[5]= FireBallDownsheet.crop(Fheight*0,Fwidth*2,Fheight,Fwidth);

			Runes[0]= runesheet.crop(Rwidth*0,Rheight*0,Rwidth,Rheight);//Runes
			Runes[1]= runesheet.crop(Rwidth*1,Rheight*0,Rwidth,Rheight);
			Runes[2]= runesheet.crop(Rwidth*2,Rheight*0,Rwidth,Rheight);
			Runes[3]= runesheet.crop(Rwidth*3,Rheight*0,Rwidth,Rheight);
			Runes[4]= runesheet.crop(Rwidth*4,Rheight*0,Rwidth,Rheight);
			Runes[5]= runesheet.crop(Rwidth*5,Rheight*0,Rwidth,Rheight);
			Runes[6]= runesheet.crop(Rwidth*6,Rheight*0,Rwidth,Rheight);
			Runes[7]= runesheet.crop(Rwidth*7,Rheight*0,Rwidth,Rheight);


			blocks[0] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Slime.png"));

			butstart[0]= newsheet.crop(11,422,93,34);//normbut
			butstart[1]= newsheet.crop(11,456,93,33);//hoverbut
			butstart[2]= newsheet.crop(11,489,93,32);//clickbut

			particleSmoke[0]= newsheet.crop(111,397,18,38);
			particleSmoke[1]= newsheet.crop(129,399,20,35);
			particleSmoke[2]= newsheet.crop(154,400,20,35);

			//Items
			items[0]= inventorysheet.crop(274,70,iwidth,iheight); //Wood
			items[1]= inventorysheet.crop(2,36,iwidth,iheight);   //Rock
			items[2]= inventorysheet.crop(172,36,iwidth,iheight); //Fire Flower (Rune)
			items[3]= inventorysheet.crop(104,2,iwidth,iheight);  //Coin
			items[4]= inventorysheet.crop(2,2,iwidth,iheight);    //Super Mushroom (+Attack)
			items[5]= inventorysheet.crop(36,2,iwidth,iheight);   //1-Up (+Health)
			items[6]= inventorysheet.crop(274,36,iwidth,iheight); //World 1 Key (Meat)


			//Updated Number Sprites
			numbers[1]= numsheet.crop(2,2,32,22);
			numbers[2]= numsheet.crop(36,2,32,22);
			numbers[3]= numsheet.crop(70,2,32,22);
			numbers[4]= numsheet.crop(104,2,32,22);
			numbers[5]= numsheet.crop(2,26,32,22);
			numbers[6]= numsheet.crop(36,26,32,22);
			numbers[7]= numsheet.crop(70,26,32,22);
			numbers[8]= numsheet.crop(104,26,32,22);
			numbers[9]= numsheet.crop(2,50,32,22);
			numbers[10]= numsheet.crop(36,50,32,22);
			numbers[11]= numsheet.crop(70,50,32,22);
			numbers[12]= numsheet.crop(104,50,32,22);
			numbers[13]= numsheet.crop(2,74,32,22);
			numbers[14]= numsheet.crop(36,74,32,22);
			numbers[15]= numsheet.crop(70,74,32,22);
			numbers[16]= numsheet.crop(104,74,32,22);
			numbers[17]= numsheet.crop(2,98,32,22);
			numbers[18]= numsheet.crop(36,98,32,22);
			numbers[19]= numsheet.crop(70,98,32,22);
			numbers[20]= numsheet.crop(104,98,32,22);


			//block images,array index is equal to block id

			//World 1 (Peach Garden)
			//New Grass Tiles
			blocks[1] = peachtiles.crop(2,2,Bwidth,Bheight); //Empty Grass
			blocks[2] = peachtiles.crop(68,2,Bwidth,Bheight); //1 Grass
			blocks[3] = peachtiles.crop(134,2,Bwidth,Bheight); //2 Grass
			blocks[4] = peachtiles.crop(200,2,Bwidth,Bheight); //1 Flower
			blocks[5] = peachtiles.crop(266,2,Bwidth,Bheight); //2 Flowers

			//Castle Tiles Brought down to just one
			blocks[6] = peachtiles.crop(332,2,Bwidth,Bheight); //Peach Castle Wall

			//New Tree
			blocks[7] = peachtiles.crop(332,68,144,182); //Tree

			//Bricks replace moss rocks
			blocks[8] = peachtiles.crop(398,2,Bwidth,Bheight); //Regular Brick
			blocks[9] = peachtiles.crop(464,2,Bwidth,Bheight); //Empty Block
			blocks[10] = peachtiles.crop(530,2,Bwidth,Bheight); //? Block

			//Rocks 
			blocks[11] = peachtiles.crop(2,68,Bwidth,72);

			//Lamp post
			blocks[12] = fountainsheet.crop(656,2,52,166);

			//Peach Statue
			blocks[13] = statuesheet.crop(2,2,104,236);

			//Bushes
			blocks[14] = peachtiles.crop(478,68,60,224); //Long Bush
			blocks[15] = peachtiles.crop(540,68,60,128); //Short Bush

			//World 2 (Desert)
			blocks[16] = deserttiles.crop(2,2,Bwidth,Bheight);      //Desert "grass"
			blocks[17] = deserttiles.crop(68,2,Bwidth,Bheight);     //Desert "Walls"
			blocks[18] = deserttiles.crop(134,2,Bwidth,Bheight);    //Empty Block (No Grass)
			blocks[19] = deserttiles.crop(2,68,134,230);            //Cactus
			blocks[20] = deserttiles.crop(138,68,64,160);           //Short Desert Pillar
			blocks[21] = deserttiles.crop(204,68,64,320);           //Long Desert Pillar	
			blocks[22] = deserttiles.crop(200,2,Bwidth,Bheight);    //? Block (No Grass)


			//Fountain
			fountain[0] = fountainsheet.crop(2,2,216,226);
			fountain[1] = fountainsheet.crop(220,2,216,226);
			fountain[2] = fountainsheet.crop(438,2,216,226);

			//Dry Bones Statue
			drystatue[0] = drybonesstatue.crop(2,2,134,262);
			drystatue[1] = drybonesstatue.crop(138,2,134,262);
			drystatue[2] = drybonesstatue.crop(274,2,134,262);
			drystatue[3] = drybonesstatue.crop(410,2,134,262);
			drystatue[4] = drybonesstatue.crop(546,2,134,262);
			drystatue[5] = drybonesstatue.crop(682,2,134,262);


			//Mario Animations
			player_front[0]=mariorun.crop(2,2,width,height);
			player_front[1]=mariorun.crop(60,2,width,height);
			player_front[2]=mariorun.crop(118,2,width,height);
			player_front[3]=mariorun.crop(176,2,width,height);
			player_front[4]=mariorun.crop(234,2,width,height);
			player_front[5]=mariorun.crop(292,2,width,height);
			player_front[6]=mariorun.crop(350,2,width,height);
			player_front[7]=mariorun.crop(408,2,width,height);

			player_left[0]=mariorun.crop(2,78,width,height);
			player_left[1]=mariorun.crop(60,78,width,height);
			player_left[2]=mariorun.crop(118,78,width,height);
			player_left[3]=mariorun.crop(176,78,width,height);
			player_left[4]=mariorun.crop(234,78,width,height);
			player_left[5]=mariorun.crop(292,78,width,height);
			player_left[6]=mariorun.crop(350,78,width,height);
			player_left[7]=mariorun.crop(408,78,width,height);

			player_right[0]=mariorun.crop(2,154,width,height);
			player_right[1]=mariorun.crop(60,154,width,height);
			player_right[2]=mariorun.crop(118,154,width,height);
			player_right[3]=mariorun.crop(176,154,width,height);
			player_right[4]=mariorun.crop(234,154,width,height);
			player_right[5]=mariorun.crop(292,154,width,height);
			player_right[6]=mariorun.crop(350,154,width,height);
			player_right[7]=mariorun.crop(408,154,width,height);

			player_back[0]=mariorun.crop(2,230,width,height);
			player_back[1]=mariorun.crop(60,230,width,height);
			player_back[2]=mariorun.crop(118,230,width,height);
			player_back[3]=mariorun.crop(176,230,width,height);
			player_back[4]=mariorun.crop(234,230,width,height);
			player_back[5]=mariorun.crop(292,230,width,height);
			player_back[6]=mariorun.crop(350,230,width,height);
			player_back[7]=mariorun.crop(408,230,width,height);

			//Mario Idle "Animations"
			marioidle_back[0]=mariorun.crop(2,306,width,height);
			marioidle_right[0]=mariorun.crop(60,306,width,height);
			marioidle_front[0]=mariorun.crop(118,306,width,height);
			marioidle_left[0]=mariorun.crop(176,306,width,height);

			//Enemies

			//Goomba Animations
			goomba_front[0]=goombasheet.crop(2,2,44,48);
			goomba_front[1]=goombasheet.crop(48,2,44,48);
			goomba_front[2]=goombasheet.crop(94,2,44,48);
			goomba_front[3]=goombasheet.crop(140,2,44,48);
			goomba_front[4]=goombasheet.crop(186,2,44,48);
			goomba_front[5]=goombasheet.crop(232,2,44,48);
			goomba_front[6]=goombasheet.crop(278,2,44,48);
			goomba_front[7]=goombasheet.crop(324,2,44,48);

			goomba_left[0]=goombasheet.crop(2,52,44,48);
			goomba_left[1]=goombasheet.crop(48,52,44,48);
			goomba_left[2]=goombasheet.crop(94,52,44,48);
			goomba_left[3]=goombasheet.crop(140,52,44,48);
			goomba_left[4]=goombasheet.crop(186,52,44,48);
			goomba_left[5]=goombasheet.crop(232,52,44,48);
			goomba_left[6]=goombasheet.crop(278,52,44,48);
			goomba_left[7]=goombasheet.crop(324,52,44,48);

			goomba_right[0]=goombasheet.crop(2,102,44,48);
			goomba_right[1]=goombasheet.crop(48,102,44,48);
			goomba_right[2]=goombasheet.crop(94,102,44,48);
			goomba_right[3]=goombasheet.crop(140,102,44,48);
			goomba_right[4]=goombasheet.crop(186,102,44,48);
			goomba_right[5]=goombasheet.crop(232,102,44,48);
			goomba_right[6]=goombasheet.crop(278,102,44,48);
			goomba_right[7]=goombasheet.crop(324,102,44,48);

			goomba_back[0]=goombasheet.crop(2,152,44,48);
			goomba_back[1]=goombasheet.crop(48,152,44,48);
			goomba_back[2]=goombasheet.crop(94,152,44,48);
			goomba_back[3]=goombasheet.crop(140,152,44,48);
			goomba_back[4]=goombasheet.crop(186,152,44,48);
			goomba_back[5]=goombasheet.crop(232,152,44,48);
			goomba_back[6]=goombasheet.crop(278,152,44,48);
			goomba_back[7]=goombasheet.crop(324,152,44,48);

			//Koopa
			koopa_front[0]=koopasheet.crop(2,2,54,74);
			koopa_front[1]=koopasheet.crop(58,2,54,74);
			koopa_front[2]=koopasheet.crop(114,2,54,74);
			koopa_front[3]=koopasheet.crop(170,2,54,74);
			koopa_front[4]=koopasheet.crop(226,2,54,74);
			koopa_front[5]=koopasheet.crop(282,2,54,74);
			koopa_front[6]=koopasheet.crop(338,2,54,74);
			koopa_front[7]=koopasheet.crop(394,2,54,74);

			koopa_left[0]=koopasheet.crop(2,78,54,74);
			koopa_left[1]=koopasheet.crop(58,78,54,74);
			koopa_left[2]=koopasheet.crop(114,78,54,74);
			koopa_left[3]=koopasheet.crop(170,78,54,74);
			koopa_left[4]=koopasheet.crop(226,78,54,74);
			koopa_left[5]=koopasheet.crop(282,78,54,74);
			koopa_left[6]=koopasheet.crop(338,78,54,74);
			koopa_left[7]=koopasheet.crop(394,78,54,74);

			koopa_right[0]=koopasheet.crop(2,154,54,74);
			koopa_right[1]=koopasheet.crop(58,154,54,74);
			koopa_right[2]=koopasheet.crop(114,154,54,74);
			koopa_right[3]=koopasheet.crop(170,154,54,74);
			koopa_right[4]=koopasheet.crop(226,154,54,74);
			koopa_right[5]=koopasheet.crop(282,154,54,74);
			koopa_right[6]=koopasheet.crop(338,154,54,74);
			koopa_right[7]=koopasheet.crop(394,154,54,74);

			koopa_back[0]=koopasheet.crop(2,230,54,74);
			koopa_back[1]=koopasheet.crop(58,230,54,74);
			koopa_back[2]=koopasheet.crop(114,230,54,74);
			koopa_back[3]=koopasheet.crop(170,230,54,74);
			koopa_back[4]=koopasheet.crop(226,230,54,74);
			koopa_back[5]=koopasheet.crop(282,230,54,74);
			koopa_back[6]=koopasheet.crop(338,230,54,74);
			koopa_back[7]=koopasheet.crop(394,230,54,74);

			//Chain Chomp
			chain_front[0]=chainchompsheet.crop(2,2,96,88);
			chain_front[1]=chainchompsheet.crop(100,2,96,88);
			chain_front[2]=chainchompsheet.crop(198,2,96,88);
			chain_front[3]=chainchompsheet.crop(296,2,96,88);

			chain_left[0]=chainchompsheet.crop(2,92,96,88);
			chain_left[1]=chainchompsheet.crop(100,92,96,88);
			chain_left[2]=chainchompsheet.crop(198,92,96,88);
			chain_left[3]=chainchompsheet.crop(296,92,96,88);

			chain_right[0]=chainchompsheet.crop(2,182,96,88);
			chain_right[1]=chainchompsheet.crop(100,182,96,88);
			chain_right[2]=chainchompsheet.crop(198,182,96,88);
			chain_right[3]=chainchompsheet.crop(296,182,96,88);

			chain_back[0]=chainchompsheet.crop(2,272,96,88);
			chain_back[1]=chainchompsheet.crop(100,272,96,88);
			chain_back[2]=chainchompsheet.crop(198,272,96,88);
			chain_back[3]=chainchompsheet.crop(296,272,96,88);

			//Dry Bones
			drybones_front[0]=drybonessheet.crop(2,2,46,74);
			drybones_front[1]=drybonessheet.crop(50,2,46,74);
			drybones_front[2]=drybonessheet.crop(98,2,46,74);
			drybones_front[3]=drybonessheet.crop(146,2,46,74);
			drybones_front[4]=drybonessheet.crop(194,2,46,74);
			drybones_front[5]=drybonessheet.crop(242,2,46,74);
			drybones_front[6]=drybonessheet.crop(290,2,46,74);
			drybones_front[7]=drybonessheet.crop(338,2,46,74);
			
			drybones_left[0]=drybonessheet.crop(2,78,46,74);
			drybones_left[1]=drybonessheet.crop(50,78,46,74);
			drybones_left[2]=drybonessheet.crop(98,78,46,74);
			drybones_left[3]=drybonessheet.crop(146,78,46,74);
			drybones_left[4]=drybonessheet.crop(194,78,46,74);
			drybones_left[5]=drybonessheet.crop(242,78,46,74);
			drybones_left[6]=drybonessheet.crop(290,78,46,74);
			drybones_left[7]=drybonessheet.crop(338,78,46,74);
			
			drybones_right[0]=drybonessheet.crop(2,154,46,74);
			drybones_right[1]=drybonessheet.crop(50,154,46,74);
			drybones_right[2]=drybonessheet.crop(98,154,46,74);
			drybones_right[3]=drybonessheet.crop(146,154,46,74);
			drybones_right[4]=drybonessheet.crop(194,154,46,74);
			drybones_right[5]=drybonessheet.crop(242,154,46,74);
			drybones_right[6]=drybonessheet.crop(290,154,46,74);
			drybones_right[7]=drybonessheet.crop(338,154,46,74);
			
			drybones_back[0]=drybonessheet.crop(2,230,46,74);
			drybones_back[1]=drybonessheet.crop(50,230,46,74);
			drybones_back[2]=drybonessheet.crop(98,230,46,74);
			drybones_back[3]=drybonessheet.crop(146,230,46,74);
			drybones_back[4]=drybonessheet.crop(194,230,46,74);
			drybones_back[5]=drybonessheet.crop(242,230,46,74);
			drybones_back[6]=drybonessheet.crop(290,230,46,74);
			drybones_back[7]=drybonessheet.crop(338,230,46,74);
			
			
			//NPCS			

			//Peach
			princesspeach[0]=npcsheet.crop(2,2,48,94);   //Front
			princesspeach[1]=npcsheet.crop(52,2,48,94);  //Left
			princesspeach[2]=npcsheet.crop(102,2,48,94); //Back
			princesspeach[3]=npcsheet.crop(152,2,48,94); //Right


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(Images.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}



}