public class ConstructorModel{
	
	
	public static void main(String[] args){
		
		
		Constructormodel01 demo= new Constructormodel01();
		Constructormodel01 first= new Constructormodel01("The Nilgiris");
		Constructormodel01 second= new Constructormodel01("The nilgiris","TN-43" );
		Constructormodel01 third= new Constructormodel01("The nilgiris","NH",2636 );
		Constructormodel01 fourth= new Constructormodel01("The nilgiris","NH",2636,(byte)5 );
		Constructormodel01 fifth= new Constructormodel01("The nilgiris","NH",2636,(byte)5,17.5f);
		Constructormodel01 sixth= new Constructormodel01("The nilgiris","NH",2636,(byte)5,17.5f,"Queen of hills");
		Constructormodel01 seventh= new Constructormodel01("The nilgiris","NH",2636,(byte)5,17.5f,"Queen of hills",200000L);
		Constructormodel01 eighth= new Constructormodel01("The nilgiris","NH",2636,(byte)5,17.5f,"Queen of hills",200000L,1234 );
		Constructormodel01 ninth= new Constructormodel01("The nilgiris","NH",2636,(byte)5,17.5f,"Queen of hills",200000L,1234,"tea");
		Constructormodel01 last= new Constructormodel01("The nilgiris","NH",2636,(byte)5,17.5f,"Queen of hills",200000L,1234,"tea","Blue Mountain");
		
		
		
	}



 public static class Constructormodel01{
	 
	    String District;
		String NH;
		int sealevel;
		byte taluk;
		float temperature;
		String Special_name;
		long population;
		int area;
		String famousfor;
		String OtherName;
	 
	  
	public Constructormodel01(){
	  System.out.println("Default");
	  System.out.println("------");
	  
	}
	public Constructormodel01(String District){
		this.District=District;
		System.out.println("------");
	}
	public Constructormodel01(String District,String NH){
		this.District=District;
	    this.NH=NH;
		System.out.println(District);
		System.out.println(NH);
		System.out.println("------");
	}
	public Constructormodel01(String District,String NH,int sealevel){
		  
	    this.sealevel=sealevel;
		System.out.println(sealevel);
		System.out.println("------");
	}
	public Constructormodel01(String District,String NH,int sealevel,byte taluk){
		 
	 this.taluk=taluk; 
		System.out.println(taluk);
		System.out.println("------");
	}
	public Constructormodel01(String District,String NH,int sealevel,byte taluk,float temperature){
		
	 this.temperature=temperature;
		System.out.println(temperature);
		System.out.println("------");
	}
	public Constructormodel01(String District,String NH,int sealevel,byte taluk,float temperature,String Special_name ){
		t 
	 this.Special_name=Special_name;
	  
		System.out.println(Special_name);
		System.out.println("------");
	}
	public Constructormodel01(String District,String NH,int sealevel,byte taluk,float temperature,String Special_name,long population){
		 
	 this.population=population;
	  
		System.out.println(population);
		System.out.println("------");
	}
	public Constructormodel01(String District,String NH,int sealevel,byte taluk,float temperature,String Special_name,long population,int area  ){
		 
	 this.area=area;
		System.out.println(area);
		System.out.println("------");
	}
	public Constructormodel01(String District,String NH,int sealevel,byte taluk,float temperature,String Special_name,long population,int area,String famousfor ){
		 
	 this.famousfor=famousfor;
	 
		System.out.println(famousfor);
		System.out.println("------");
	}
	
	
	public Constructormodel01(String District,String NH,int sealevel,byte taluk,float temperature,String Special_name,long population,int area,String famousfor,String OtherName){
		 
	 this.OtherName=OtherName;
		System.out.println(OtherName);
		System.out.println("------");
	}
	
	
	
	
 }
	
	
		
}