import java.awt.Graphics;

public abstract class Status {

	private static Status currentState = null;
	
	public static void setState(Status state) {
		currentState = state;
	}
	
	public static Status getState() {
		return currentState;
	}
	
	protected Game game;
	
	public Status(Game game) {
		this.game  = game;
	}
	

	public abstract void tick();
	public abstract int getX();
	public abstract int getY();
	public abstract void decHP();
	public abstract int getHP();
	public abstract void render (Graphics g); 
}
