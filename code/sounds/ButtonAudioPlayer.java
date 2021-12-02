package sounds;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import MainPackage.MainClass;

public class ButtonAudioPlayer {
	
	private AudioInputStream  audioInputStream;
	Clip clip;
	
	public ButtonAudioPlayer() {
		loadButtonAudio();
	}
	
	void loadButtonAudio() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(MainClass.class.getResource("../audio/spaceShipSelection.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-15.0f);
			
			clip.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
