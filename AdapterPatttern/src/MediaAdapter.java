
public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMusicPlayer;
	public MediaAdapter(String audioType) {
		// TODO Auto-generated constructor stub
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer=new VlcPlayer();
			
		}
		else if(audioType.equalsIgnoreCase("mp4")) {
			
			advancedMusicPlayer=new Mp4Player();
			
		}
	}
	
@Override
public void play(String audioType, String fileName) {
	// TODO Auto-generated method stub
if(audioType.equalsIgnoreCase("vlc")) {
	advancedMusicPlayer.playVlc(fileName);

	
}

else if(audioType.equalsIgnoreCase("mp4")) {
	advancedMusicPlayer.playMp4(fileName);
}
}
}
