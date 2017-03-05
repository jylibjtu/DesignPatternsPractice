package Adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mp4_1 = "mp4:夏天夏天悄悄过去留下小秘密......";
		String mp4_2 = "mp4:Oh baby 你就是我的唯一......";
		String vlc_1 = "vlc:那就不要留，时光一过不再有......";
		String vlc_2 = "vlc:今天我，寒夜里看雪飘过......";
		String damagedData = "lc:啊啊啊啦啦啦";
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play(mp4_1);
		audioPlayer.play(mp4_2);
		audioPlayer.play(vlc_1);
		audioPlayer.play(vlc_2);
		audioPlayer.play(damagedData);
		
	}

}
