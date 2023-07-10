package dome;

import java.util.ArrayList;

public class Database {
	private ArrayList<CD> listCD = new ArrayList<CD>();
	
	public void add(CD cd) {
		listCD.add(cd);
	}
	
	public void list() {
		for(CD cd:listCD) {
			cd.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("abc","abc",3,60,"..."));
		db.add(new CD("abc","abc",3,60,"..."));
		db.list();
	
	}

}
