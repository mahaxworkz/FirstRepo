public class Constructorprogram {
	
	public Constructorprogram(){
		
	System.out.println("constructor is created");	
	}
    public Constructorprogram(int id){
	System.out.println("another constructor");
    }
	public Constructorprogram(int id,String name){
	System.out.println("name:"+name);
    }
	public Constructorprogram(String city){
	System.out.println(city.length());
    }
	public Constructorprogram(String country,long population){
	System.out.println(country.isEmpty());
	System.out.println(population);
    }
	
	
	public static void main(String[] args){
		
	 Constructorprogram Cons= new Constructorprogram();	
	 Constructorprogram value= new Constructorprogram(20);
	 Constructorprogram demo= new Constructorprogram(20,"Black panther");
	 Constructorprogram Length= new Constructorprogram("tokyo");
	 Constructorprogram isempty= new Constructorprogram("",2000000L);
	 
	}
	
}