public class Methodofstatic{

public static void main(String[] args){
	Methodone.callfirst();
	Methodone.writefirst();
	
	Methodone demo=new Methodone();       System.out.println(demo.distance);
	   System.out.println(demo.city);
	   System.out.println(demo.bloodgrp);
	   System.out.println(demo.isright);
	   System.out.println(demo.degree);
	   demo.readfirst();
	
}
public static class Methodone{
	static int year;
	static long regno;
	static String name;
	static String dept;
	static int dept_code;
	String city = "japan";	
	int distance=45;
	char bloodgrp='A';
	float degree=17f;
	boolean isright=false;
	
	static{
		year=4;
		regno=713619104020L;
		name="Fuji";
		System.out.println(year);
		System.out.println(name);
		System.out.println(regno);
		
	}
	public static void callfirst(){
		System.out.println("first method");
	}
	public static void writefirst(){
		System.out.println("next method");
	}
	 public void readfirst(){
		System.out.println(" other method");
	}
	 
}
}