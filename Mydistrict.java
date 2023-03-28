public class Mydistrict{
  static String name="The nilgiris";
  static String district="The nilgiris";
  static String NH="TN43";
  static String Othername="Queen of hills";
  static String Country=new String("india");
  final String State="tamilnadu";
  final char area=2625;
  final short nooftaluks=5;
  final String famousfor="hills";
  final String climate="cloudy&misty";
  String Collector;
  long population;
  String transpotation;
  float temperature;
  float literatureratio;
  Famousproducts pro;
  Taluks place;
  Neighbourdist near;
  Famousflower flower;
  FamousAnimal animal;
   public Mydistrict(Famousproducts pro, Taluks place,Neighbourdist near,Famousflower flower,FamousAnimal animal){
	 	 this.pro=pro;
	      this.place=place;
	      this.near=near;
	     this.flower=flower;
	     this.animal=animal;
	} 
public static void main(String[] args){
	Mydistrict mydist=new Mydistrict(Famousproducts.Tea,Taluks.Kotagiri,Neighbourdist.Coimbatore,Famousflower.Kurinji,FamousAnimal.langur);
	  System.out.println(mydist.animal);
	  endindex("hello everyone well come");
	  Substringdemo();
	  Stringformate();
	  gettingbyte();
	  matchingregion();
	  startingindex("Thiru S.P.Amrith");
	  codepointing("Tamil Nadu");
	  checkempty();
	  ignoringcase("india");
	  contentmethod();
  }

public static String endindex(String demo){
	int Mystr=demo.lastIndexOf("come");
	System.out.println(Mystr);
	return demo;
} 
public static String Substringdemo(){
	String splname=Othername.substring(2,8);
	System.out.println(splname);
	return splname;
} 
public static String Stringformate(){
	String S=String.format("I love %s",name);
	System.out.println(S);
	return S;
} 
public static void gettingbyte(){
	byte[] bit = NH.getBytes();
	System.out.println(bit);
	 
} 
public static String matchingregion(){
	String str="my fav The nilgiris";
	boolean region=str.regionMatches(7,name,0,11);
	System.out.println(region);
	return str;
} 
 public static String startingindex(String collector){
	boolean collectorate=collector.startsWith("Thiru");
	System.out.println(collectorate);
	return collector;
 }
public static String codepointing(String Mystate){
    int temp=Mystate.codePointAt(0);
	System.out.println(Mystate);
	return Mystate;
 }
public static void checkempty(){ 
	boolean method1= district.isEmpty();
	 System.out.println(method1);
}  
public static void ignoringcase(String nation){ 
     String nationality="indian";
	boolean check= nation.equalsIgnoreCase(nationality);
	 System.out.println(check);
} 
public static void contentmethod(){ 
     String nation= new String("india");
	boolean memory= nation.contentEquals(Country);
	 System.out.println(memory);
} 


enum Famousflower{
	Kurinji,Jagerenda,Peachblossoms,Cherryblossoms
}
enum FamousAnimal{
	Nilgiritahr,flycatcher,langur,tragus,woodpigeon
}
 enum Neighbourdist{
	 Coimbatore,Erode,Tripur
}
enum Taluks{
	Kotagiri,Ooty,Cudalur,Banthalur,conoor
}
enum Famousproducts{
	Tea,ukalyptus,honey,sweaters,varkey
}


}