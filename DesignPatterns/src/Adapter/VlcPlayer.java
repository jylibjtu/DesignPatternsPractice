package Adapter;

import Adapter.I.AdvancedMediaPlayer;

public class VlcPlayer extends AdvancedMediaPlayer {

	@Override
	public void playVlc(String simulateData) {
		// TODO Auto-generated method stub
		System.out.println("VlcPlayer playing vlc media:  " + simulateData);
	}

	@Override
	public void playMp4(String simulateData) {
		// TODO Auto-generated method stub
		System.out.println("VlcPlayer playing mp4 media:  " + simulateData);
	}

}
