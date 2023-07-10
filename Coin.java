package coins;

import java.util.HashMap;

import java.util.Scanner;

public class Coin {
	private HashMap<String,Integer> coinnames = new HashMap<String,Integer>();
	
	//iniciallize 
	
	public Coin(){
		//coinnames.put(key, value);
		coinnames.put("penny",1);
		coinnames.put("dime",10);
		coinnames.put("quarter",25);
		coinnames.put("half-dollar",50);
		
	}
	
	
//	public String getName(int amount) {
//		return coinnames.get(amount);
//	}
	public Integer getName(String k) {
 	   return coinnames.get(k);}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int amount = in.nextInt();
//		Coin coin=new Coin();
//		String name = coin.getName(amount);
//		System.out.println(name);
		Scanner in = new Scanner(System.in);
		String s=in.next();
	
		
		Coin coin=new Coin();
	   
	    	Integer value=coin.getName(s);
		System.out.println(value);
		
		
	}

}
