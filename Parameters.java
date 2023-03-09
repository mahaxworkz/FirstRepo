public class Parameters{
	
public static void main (String[] args){
	int z=FirstMethod(20);
   System.out.println(z);
    
	String firstname= SecMethod("MBA","blackpanther");
   System.out.println(firstname);
   
   int IA_test= ThirdMethod(6,550,true);
   System.out.println(IA_test); 
   
     int shoping= Fourthmethod(760,6,1000,240,true);
   System.out.println(shoping);   
   
}
public static int  FirstMethod(int sNo){
	return sNo;
}
public static String SecMethod(String degree,String Name){
	System.out.println(Name + " marvel");
	System.out.println(degree);
	
	return Name;
}
public static int ThirdMethod(int sub,int mark,boolean ispass){
	System.out.println(sub + " for all subjects");
	System.out.println(mark);
	System.out.println(ispass);
	return 12;
}
public static int Fourthmethod(int cost,int items,int amount,int balance,boolean isbalance){
	System.out.println(cost + " for all items");
	System.out.println(items);
	System.out.println(amount);
	System.out.println(balance);
	System.out.println(isbalance);
	
	return 0;
}

}