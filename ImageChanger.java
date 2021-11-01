import java.awt.image.BufferedImage;

public class ImageChanger {
        static int num = 0;
	public static BufferedImage player, enemy,backGround,bullet,explosion,gameover,enemyLaser,hp,mbc;
	public static void init() {
            num++;
		enemyLaser = LoadImage.loadImage("enemybullet.png");
		enemy = LoadImage.loadImage("enemy.png");
		backGround = LoadImage.loadImage("a (0).png");
		explosion = LoadImage.loadImage("explosion.png");
                 player = LoadImage.loadImage("jet.png");
		hp = LoadImage.loadImage("hp.png");
                 bullet = LoadImage.loadImage("missile.png");
	}
        public static void bcg() {
            num++;
            if(num > 98) num = 0;
            String s = "a ("+num+").png";
            backGround = LoadImage.loadImage(s);
        }
	
}
