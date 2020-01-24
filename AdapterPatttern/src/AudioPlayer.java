
public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("playing mp3 file .NAME:"+fileName);
		}
		else if (audioType.equalsIgnoreCase("VLC")|| audioType.equalsIgnoreCase("mp4")) {
			
			mediaAdapter=new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
			
		}
		
		else {
			System.out.println("invalid media ."+audioType+"format not  supported");
			
		}
		
		
	}

}
