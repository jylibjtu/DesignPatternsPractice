package Adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mp4_1 = "mp4:�����������Ĺ�ȥ����С����......";
		String mp4_2 = "mp4:Oh baby ������ҵ�Ψһ......";
		String vlc_1 = "vlc:�ǾͲ�Ҫ����ʱ��һ��������......";
		String vlc_2 = "vlc:�����ң���ҹ�￴ѩƮ��......";
		String damagedData = "lc:������������";
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play(mp4_1);
		audioPlayer.play(mp4_2);
		audioPlayer.play(vlc_1);
		audioPlayer.play(vlc_2);
		audioPlayer.play(damagedData);
		
	}

}
