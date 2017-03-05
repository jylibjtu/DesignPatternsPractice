package Adapter;

import Adapter.I.AdvancedMediaPlayer;

public class Mp4Player extends AdvancedMediaPlayer {

	@Override
	public void playVlc(String simulateData) {
		// TODO Auto-generated method stub
		System.out.println("Mp4Player playing vlc media:  " + simulateData);
	}

	@Override
	public void playMp4(String simulateData) {
		// TODO Auto-generated method stub
		System.out.println("Mp4Player playing mp4 media:  " + simulateData);
	}

}
