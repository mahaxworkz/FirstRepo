 public class ParametersTest{
	 
	 
	public static void main(String[] args) {
		method01(4);
		method02("ottomi");
		method03(true);
		method04(27,100);
		method05(19f);
		method06("fuji",20);
		
	}
	 public static void method01(int num){
		 System.out.println(num);
	 }
	 public static void method02(String city){
		 System.out.println(city);
	 }
	 public static void method03(boolean is_she_coder){
		 System.out.println(is_she_coder);
	 }
	 public static void method04(int value,int mark){
		 System.out.println(value);
		 System.out.println(mark);
	 }
	 public static void method05(float temp){
		 System.out.println(temp);
	 }
	 public static void method06(String name,int regno){
		 System.out.println(regno);
	 }
 }