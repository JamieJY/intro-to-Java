package dome;

public class DVD extends Item {
	//private String title;
	private String director;
	
//	private int playingTime;
	//private boolean gotIt=false;
//	private String comment;
	
	
	
	



	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment);
		//this.title = title;
		this.director = director;
		//this.playingTime = playingTime;
		//this.comment = comment;
	}


	
	

//----write your own toString 
	@Override
	public String toString() {
		return "DVD [director=" + director + ", toString()=" + super.toString() + "]";
	}





// ----write your own equals ,这个equals会取代object里的equals函数，所以66行的equals调用的是override的equals
	//如果把这里的函数名称改成public boolean equals(DVD obj,int i)，多了参数int i，执行程序又会去调用object的equals，结果就是false
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		//向下造型
		DVD dd=(DVD)obj;
		return director.equals(dd.director);
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD("a","b",1,"..");
		DVD dvd1 = new DVD("a","b",1,"..");
		dvd.print();
		String s="ab"+dvd;
		System.out.println(dvd.toString());
		System.out.println(dvd);
		System.out.println(s);
		System.out.println("------------");
		
		System.out.println(dvd.equals(dvd1));
	}



	public void print() {
		// TODO Auto-generated method stub
		//System.out.println("DVD:"+title+","+director);
		System.out.print("DVD:");
		super.print();
		System.out.println(director);
	}

}
