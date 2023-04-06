            programming questions

6)JDB
7)   output;
        ***
        +++++
        ***
        +++++
        ***
        +++++
        ***
        +++++
        ***
        +++++
        ***
        +++++
        ***
        +++++
        ***

 
 8) c. heap memory
 
 10) output 50 ( but it shows possible lossy conversion .So use short x= (short)10;)
 
 12)-127( range of byte data is -128to 127)
 
 14)   Palindrome
 
       public class Palindrome{
	  
		  public static void main(String[] args) {

		    String example  = "Mom";
		    String reex = "";
		    
		    int reexLength = example.length();

		    for (int i = (reexLength -  1); i >=0; --i) {
		      reex = reex + example.charAt(i);
		    }

		    if (example.equalsIgnoreCase(reex )) {
		      System.out.println(example + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(example + " is not a Palindrome String.");
		    }
		  }
		
      }
 
 
 
 