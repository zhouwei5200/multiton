package com.example.duoli;

import java.util.ArrayList;
import java.util.Random;

public class duoli {
	public final static int  max = 2;
	public static ArrayList name = new ArrayList(2);
	public static ArrayList<duoli> hang = new ArrayList(2);
	static{
		for(int i = 0;i<3;i++){
			hang.add(new duoli());
		}
	}
	public duoli(){}
	private duoli(String name1){
		name.add(name1);
	}
	private static  duoli getInstance(){
		Random random = new Random();
		int i = random.nextInt(2);
		return hang.get(i);
		
	}
	
	
	

}
