public class ReturnTypes{
	
public static void main (String[] args){
 int value = Sampleint();	
 System.out.println(value);	
 
 float temperature = ExampleFloat();	
 System.out.println(temperature);
 
 long worth = Examplelong();	
 System.out.println(worth);
 
 char bg= Examplechar();	
 System.out.println(bg);
 
 String japan= Samplestring();	
 System.out.println(japan);
 
 double trprate=  SampleDouble();	
 System.out.println(trprate);
 
 byte year= Samplebyte();	
 System.out.println(year);
 
 boolean vote= Exampleboolean();	
 System.out.println(vote);
 
 short income= Sampleshort();	
 System.out.println(income);
 	
}	
public static int Sampleint(){
	int mark=5;
	return mark;
}
public static float ExampleFloat(){
	float temp = 5f;
	return temp;
}	
public static long Examplelong(){
	long a  = 400000L;
	return a;
}	
public static char Examplechar(){
	char bloodgroup = 'b';
	return bloodgroup;
}
public static String Samplestring(){
	String city = "Tokyo";
	return city;
}	
public static double SampleDouble(){
	double trp  = 75.4;
	return trp;
}		
public static byte Samplebyte(){
	byte age  = 45;
	return age;
}	
public static boolean Exampleboolean(){
	boolean eligible  = true;
	return eligible;
}
public static short Sampleshort(){
	short stipend  = 5000 ;
	return stipend;
}					
}