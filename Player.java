import java.awt.Graphics;

public class Player extends Creature{

	private Game game;
	
	//private boolean fire;
	protected int health;

	
	public Player(Game game,float x, float y) {
		super(x, y);
		health = 3;
		this.game = game;
	}

	
	@Override
	public void tick() {
		if(!(health<0)) {
		if(game.getKeyManager().up && y>0)
			y=y-8;
		if(game.getKeyManager().down && y<660)
			y=y+8;
		if(game.getKeyManager().left && x>0)
			x=x-8;
		if(game.getKeyManager().right && x<1215)
			x=x+8;
		if(game.getKeyManager().fire) {
			long breaks = (System.nanoTime()- game.getTime())/1000000;
			if(breaks > game.getDelay()) {
				Game.bullet.add(new PlayerLaser((int)x+42,(int)y-20));
			}
			game.ResCurrent();
			}
		}
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(ImageChanger.backGround,0,0,1280,720, null);
		g.drawImage(ImageChanger.player,(int)x,(int)y,null);
	}
	
	public int getX() {
		return (int) x;
	}
	
	public int getY() {
		return (int) y;
	}

}
