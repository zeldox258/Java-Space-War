import java.awt.Color;
import java.awt.Graphics;

public class PlayerLaser {
	private int x;
	private int y;
	private int speed;
	
	public PlayerLaser(int x, int y) {
		this.x = x;
		this.y = y;
		speed=10;
	} 
	public void tick() {
		y -=speed;
	}

	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.drawImage(ImageChanger.bullet, x+12,y-4,null);

	}
	
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
}
