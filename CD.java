package dome;

public class CD extends Item {
	
	private String artist;
	private int numofTracks;


	
	
	
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        super(title,playingTime,false,comment);
		//this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		//this.playingTime = playingTime;
		//this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		//System.out.println("CD:"+title+","+artist);
	}

	

}
