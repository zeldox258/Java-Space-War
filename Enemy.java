import java.awt.Graphics;
import java.util.Random;

public class Enemy extends Creature {

	private long lastLaser = 0;
	private long delay = 2000;

	public Enemy(float x, float y) {
		super(x, y);
	}

	@Override
	public void tick() {
		y++;

		if (this.y > 0) {
			Random random = new Random();
			int randNum = random.nextInt(100);
			if (randNum == 0 && lastLaser + delay < System.currentTimeMillis()) {
				lastLaser = System.currentTimeMillis();
				Game.lasers.add(new EnemyLaser((int) (this.x + 53), (int) (this.y + 64)));
			}
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(ImageChanger.enemy,(int)x,(int)y,null);   
	}
	
	public int getX() {
		return (int) x;
	}
	
	public int getY() {
		return (int) y;
	}

}
