public class Returntypetest{
	
	public static void main(String[] args){
		 int one =first(25);
		 System.out.println(one);
		 
		 float two = second(5);
		 System.out.println(two);
		 
		 String three=third("apple");
		 System.out.println(three);
		 
		 int four = fourth(9);
		 System.out.println(four);
		 
		 String five = fifth("dbms","Tony");
		 System.out.println(five);
	}
	
	public static int first(int value){
		return value;
	}
	public static float second(int temp){
		return temp;
	}
	public static String third(String fruit){
		return fruit;
	}
	public static int fourth(int cgpa){
		return 4;
	}
	public static String fifth(String sub,String staff){
		return staff;
	}
}