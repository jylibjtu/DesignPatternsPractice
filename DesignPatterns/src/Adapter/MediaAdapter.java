package Adapter;

import Adapter.I.MediaPlayer;
import Adapter.I.AdvancedMediaPlayer;
public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer adPlayer;
	@Override
	public void play(String simulateData) {
		// TODO Auto-generated method stub
		if(simulateData.startsWith("mp4:")){
			adPlayer = new Mp4Player();
			this.adPlayer.playMp4(simulateData);
		} else if(simulateData.startsWith("vlc")){
			adPlayer = new VlcPlayer();
			this.adPlayer.playVlc(simulateData);
		} else {
			System.out.println("格式无法识别：" + simulateData);
		}
			
	}

}
