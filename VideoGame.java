package dome;

public class VideoGame extends Item {
	private int numberofPlayers;
	
	
	public VideoGame(String title, int playingTime, boolean gotIt, String comment,int number) {
		super(title, playingTime, gotIt, comment);
		numberofPlayers = number;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("VideoGame:");
		super.print();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
