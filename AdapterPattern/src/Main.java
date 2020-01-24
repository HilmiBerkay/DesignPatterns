
interface MediaPlayer{
	
	public void play(String audiotype,String fileName);
}


interface AdvancedMediaPlayer{
	
	public void playVlc(String fileName);
	public void playMp4(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer{
	
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file .name :"+fileName);
	}
	
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
//do nothing	
	}
	
}
class Mp4Player implements AdvancedMediaPlayer{
	
	 @Override
	public void playVlc(String fileName) {
		//do nothing
		
	}
	 
	 public void playMp4(String fileName) {
		 
		 System.out.println("Playing Mp4 file name:::"+fileName);
	 }
}

class MediaAdapter implements MediaPlayer{
	AdvancedMediaPlayer advancedMusicPlayer;
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer=new VlcPlayer();
			
		}
		else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer=new Mp4Player();
		}
		
	}
	
	public void play(String audioType,String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}	
	}
}

class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;
	
	public void play(String audioType,String fileName) {
		
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 fle Name:"+fileName);

		}
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			
			mediaAdapter =new MediaAdapter(audioType);
			mediaAdapter.play(audioType,fileName);
			
		}
		
		else {
			
			System.out.println("Invalid media."+audioType+"Format not supoorted");
			
		}
	}
	
}


public class Main {
	 public static void main(String[] args) {
	      AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	   }
}
