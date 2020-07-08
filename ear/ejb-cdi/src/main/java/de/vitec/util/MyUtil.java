package de.vitec.util;

public class MyUtil {
	
	String utilName;
	static MyUtil util;
	
	public MyUtil(String utilName) {
	   this.utilName = utilName;	
	}
	
	public void doUtilStuff() {
		System.out.println("UtilName"+ utilName);
	}
	
	public static void createStatic(String name) {
		util = new MyUtil(name);
	}
		
	public static MyUtil getStatic() {
		return util;
	}

}
