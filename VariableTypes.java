public class VariableTypes{
	/*class variable*/
	int value = 100;
	float degree = 4f;
	static long wealth = 2000000L;
	static int ID =27;
	String hero="Black panther";
	char bloodtype='B';
	String place="saitama";
	int fee = 4500;
	boolean eligible_for_vote =true;
	int regno=20;
	
    public VariableTypes(String place){
	System.out.println(this.place);	
	System.out.println( place);
	}
	public VariableTypes(boolean eligible_for_vote ){
	System.out.println(eligible_for_vote);	
	System.out.println(this.eligible_for_vote);
	}
public static void main(String[] args){
	call(4,44);
	write(false,"trichy");
	read("language");
	wait(19f,"black adam",'A');
	run(22,1004);
	
	VariableTypes demo=new VariableTypes("tokyo");
	VariableTypes vote=new VariableTypes(false);
	
	
	System.out.println(wealth);
	 
}
public static void call(int value,int mark){
	System.out.println(mark);
	System.out.println("class variable" +wealth);
}
public static void wait(float degree,String hero,char bloodtype){
	 
	System.out.println(hero);
}
public static void run(int id,int bookNo){
	 System.out.println(id);
	 System.out.println("it is class variable" +ID);
	System.out.println(bookNo);
}
public static void write(boolean eligible_for_vote,String city){
	 
	System.out.println(city);
	System.out.println(eligible_for_vote);
}
public static void read(String language) {
	 
	System.out.println("english");
}
 

}