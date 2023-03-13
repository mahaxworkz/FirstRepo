public class Constructorchain{
	public Constructorchain(){
		this(19f);
		System.out.println("Default constructor");
	}
	public Constructorchain(float temp){
		this("The Nilgiris","NH-43");
		System.out.println(temp);
	}
	public Constructorchain(String language){
		this();
		System.out.println(language);
	}
	public Constructorchain(String place,String NH){
		this(2637);
		System.out.println(place);
		System.out.println(NH);
	}
	public Constructorchain(int sealevel){
		System.out.println(sealevel);
	}
	
	
	public static void main(String[] args){
		Constructorchain chain = new Constructorchain("Tamil");
	}
}