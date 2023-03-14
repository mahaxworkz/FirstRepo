public class Constructortest{
	
   public Constructortest(){
	this("black");
   System.out.println("default");
  }
   public Constructortest(String color){
	this("tamilNadu",38);
   System.out.println(color);
  }
   public Constructortest(int mark){
	this();
   System.out.println(mark);
  }
   public Constructortest(String state,int no_of_dist){
	this(9f,"bbc");
   System.out.println(state);
   System.out.println(no_of_dist);
  }
   public Constructortest(float gpa){
	
   System.out.println(gpa);
  }
	public Constructortest(float trp,String channel){
	this(32f);
   System.out.println(trp);
  }
	public static void main(String[] args){
		
		Constructortest demo = new Constructortest(44);
	}
}