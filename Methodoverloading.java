public class Methodoverloading{
	
  public static void main(String[] args){
	overload(); 
	overload(3);
	overload(20,27);
	overload(20,21,22);
	overload(31,32,33,32);
	overload(41,42,43,44,45);

	overload(4000000L);
	overload(44.4);
	overload(true);
	overload(4f);
	overload("four");
	
	overload(4f,4f,24,34,44);
    overload(5,7f,55,45,65);
	overload(4,43,6f,67,75);
	overload(22,11,4,5f,24);
	overload(4,6,24,94,5f);
	 
	
  }	
  public static void overload(){
	  
	System.out.println("No parameters");  
  }
   /* no of arguments*/
   public static void overload(int temp){
	  
	System.out.println("with one parameters" +temp);  
  }
  public static void overload(int temp,int value){
	  
	System.out.println("with 2 parameters,temp is " +temp);  
	System.out.println("with 2 parameters,value is"  +value); 
  }
  public static void overload(int temp,int value,int point){ 
	  System.out.println("with 3 parameters,temp is " +temp);  
	System.out.println("with 3 parameters,value is"  +value); 
    System.out.println("with 3 parameters,point is" +point); 
  }
  public static void overload(int temp,int value,int point,int mark){
	  
	 System.out.println("with 4 parameters,temp is " +temp);  
	System.out.println("with 4 parameters,value is"  +value); 
    System.out.println("with 4 parameters,point is" +point); 
    System.out.println("with 4 parameters , mark is" +mark);  
  }
  public static void overload(int temp,int value,int point,int mark,int digit){
	System.out.println("with 5 parameters,temp is " +temp);  
	System.out.println("with 5 parameters,value is"  +value); 
    System.out.println("with 5 parameters,point is" +point); 
    System.out.println("with 5 parameters , mark is" +mark); 	
	System.out.println("with 5 parameters ,digit is" +digit);  
  }
	/*different data type*/
	public static void overload(long data){
	  
	System.out.println("with long data type" +data ); 
	}
	public static void overload(double data){
	System.out.println("with double datatype" +data); 
	}
	public static void overload(boolean data){
	System.out.println("with boolean datatype"+data); 
	}
	public static void overload(float data){
	System.out.println("with float datatype"+data); 
	}
	public static void overload(String data){
	System.out.println("with String datatype"+data); 
	}
	/* order of parameter*/
	public static void overload(float temp, float value,int point,int mark,int digit){
	System.out.println("order is temp,value,point,mark,digit " +temp);  
	}
	public static void overload(int value,float point,int temp,int digit,int mark){
	System.out.println("order is value ,point,temp,digit,mark" +value );  
	}
	public static void overload(int point ,int mark ,float value ,int temp,int digit ){
	System.out.println("order is point,mark,value,temp,digit " +point );  
	}
	public static void overload(int mark,int digit,int point,float temp,int value){
	System.out.println("order is mark,digit,point,point,temp,value " +mark );  
	}
	public static void overload(int digit,float temp,int point ,int mark,float value ){
	System.out.println("order is  digit,temp,point,mark,value " +digit);  
	}
	
	   
}