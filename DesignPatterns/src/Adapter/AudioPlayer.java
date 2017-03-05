package Adapter;

import Adapter.I.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter = new MediaAdapter();
	@Override
	public void play(String simulateData) {
		mediaAdapter.play(simulateData);
	}

}
