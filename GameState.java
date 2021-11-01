import java.awt.Graphics;
import java.io.IOException;
import javax.swing.JOptionPane;
public class GameState extends Status {
	public int px;
	public int py;
	private Player player;
	private boolean check = false;
	
	public GameState(Game game) {
		super(game);
		player = new Player(game,600,600);
	}
	@Override
	public void tick() {

		player.tick();
		px = player.getX();
		py = player.getY();
	}
	
	public void decHP(){
		player.health--;
	}

	public int getHP() {
		return player.health;
	}
	public int getX() {
		return px;
	}
	public int getY() {
		return py;
	}
	@Override
	public void render(Graphics g) {

		if(!(player.health<=0)) {
			player.render(g);
		}
                else{
                    String message = "Name :"+game.getName()+" Score :"+game.getScore();                    
                    JOptionPane.showMessageDialog(null, message, "Game Over", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
			

			
	}
}
	
	

