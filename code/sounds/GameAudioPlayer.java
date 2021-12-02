package sounds;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import MainPackage.MainClass;

public class GameAudioPlayer {
	
	private AudioInputStream  audioInputStream;
	Clip clip;
	
	public GameAudioPlayer() {
		loadSpaceAmbience();
	}
	
	void loadSpaceAmbience() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(MainClass.class.getResource("../audio/space-ambience.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-15.0f);
			
			clip.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
