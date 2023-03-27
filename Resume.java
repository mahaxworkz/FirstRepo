public class Resume{

static String Name="fujisan";
static String FatherName ;
int age;
Marital_status marital;
String Education;
Gender gender;
boolean experience;
static String email;
static long phonenumber;
String achievements;

public Resume(int age,Marital_status marital,Gender gender){
	this.age=age;
	this.marital=marital;
	this.gender=gender;
	
}
public static void main(String[] args){
	Resume CV=new Resume( 20,Marital_status.UNMARIED,Gender.FEMALE);
	System.out.println(Resume.Name);
	System.out.println(Resume.email);
	System.out.println(CV.marital.applicant);
	System.out.println(CV.gender);
	System.out.println(CV.gender.gen);
	
}

enum Marital_status{
	MARIED("maried"),UNMARIED("bachelor");

    String applicant;
    Marital_status(String applicant) {
	  this.applicant=applicant;
}
 }
enum Gender{
	MALE("MR"),FEMALE("MISS/MRS"),TRANSGENDER("transgender");
	String gen;
    Gender(String gen) {
	  this.gen=gen;
}
}}