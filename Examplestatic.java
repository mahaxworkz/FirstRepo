public class Examplestatic {
	
	public static void main(String[] args){
	  Example demo = new Example();
	    Example.size='L';
	   System.out.println(Example.value);
	   System.out.println(Example.language);
	   System.out.println(Example.point);
	   System.out.println(Example.validity);
	   System.out.println(Example.size);
	   demo.distance=44;
	   demo.city="chennai";
	   demo.degree=19.4f;
	   demo.isright=true;
	   System.out.println(demo.distance);
	   System.out.println(demo.city);
	   System.out.println(demo.bloodgrp);
	   System.out.println(demo.isright);
	   System.out.println(demo.degree);
	   
	   
	}
	
	public static class Example{
		public Example(){
		System.out.println("default");
		}	
	static int value = 5;
	static String language = "Tamil";
	static float point= 3.4f;
	static int validity = 12;
	static char size;
    String city;	
	int distance;
	char bloodgrp='B';
	float degree;
	boolean isright;
	
		
	}
}