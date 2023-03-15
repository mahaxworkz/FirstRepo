public class Condition{
	static int[] regno = {1001,1002,1003,1004,1005,1011,1012,1013,1021,1023};
     static String[] Name = {"aa","xx","cc","xx","zz","tt","ss","tt","mm","ff"};
	public static void main(String[] args){
		method01();
		for(int i=0;i<regno.length;i++){
			System.out.println(regno[i]);
		}
		
	}
	public static void method01(){
		if(Name[0]==Name[3]){
			
			System.out.println("condition is correct");
		}
		else{
			System.out.println("check the condition");
		}
		
		if(Name[1]==Name[3]){
			
		  System.out.println("condition is correct");	
		}
		else{
			System.out.println("check the condition");
		}
		
		if(Name[5]!=Name[3]){
		System.out.println("condition is correct");	
			
		}
		else{
		System.out.println("check the condition");	
		}
		if(Name[1]==Name[3] && Name[5]==Name[7]){
		System.out.println("condition is correct");	
			
		}
		else{
		System.out.println("check the condition");	
		}
		if(Name.length == 10){
		System.out.println("condition is correct");	
			
		}
		else{
		System.out.println("check the condition");	
		}
	}
	
	
	
	
	
	
	
	
	
	
}