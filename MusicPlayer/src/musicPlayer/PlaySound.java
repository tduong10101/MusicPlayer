package musicPlayer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class PlaySound {
	public static void main(String[] args) throws FileNotFoundException, JavaLayerException{
		
		
			FileInputStream file = new FileInputStream("hit.mp3");
			Player play = new Player(file);
			play.play();
		
		
	}
}
