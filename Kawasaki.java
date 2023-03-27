public class Kawasaki{
	
	Colour available;
	static String bikename;
	int price;
	String brakingSystem;
	int front_brakesize;
	int mileage;
	int seat_height;
	short warranty;
	int fueltank_capacity;
	boolean testride;
	static{
		bikename="Kawasaki_Ninja";
	}
	public  Kawasaki(int price,Colour available,int mileage){
		this.price=price;
		this.available=available;
		this.mileage=mileage;
	}
	public static void main(String[] args){
		Kawasaki bike=new Kawasaki(7900000,Colour.SPARK_BLACK ,19);
		System.out.println(bike.price);
		System.out.println( Kawasaki.bikename);
		System.out.println(bike.mileage);
		System.out.println(bike.available);
		
		
	}
	enum Colour{
		 LIME_GREEN,SPARK_BLACK,EBONY
	}
}