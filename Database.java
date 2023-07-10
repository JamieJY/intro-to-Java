package dome;

import java.util.ArrayList;

public class Database {
	private ArrayList<CD> listCD = new ArrayList<CD>();
	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	
	
	public void add(CD cd) {
		listCD.add(cd);
	}
	
	public void add(DVD dvd) {
		listDVD.add(dvd);
	}
	
	public void list() {
		for(CD cd:listCD) {
			cd.print();
		}


		for(DVD dvd:listDVD) {
			dvd.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("abc","abc",3,60,"..."));
		db.add(new CD("def","def",3,60,"..."));
		
		db.add(new DVD("ghi","ghi",100,"..."));
		db.add(new DVD("xxx","ghi",100,"..."));
		
		db.list();
	}

}
