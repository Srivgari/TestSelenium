package string;

/* In java string objects are immutable. means unmodifiable or unchangeable. 
 * once string object will be created its data and state cant be changed but a new string object will be created if we will try to modify the existing string .
 * 
 * 
 */

public class ImmutableString {
    public static void main(String[]args) {
    	String s= "Garima";
    	s.concat("Srivastava");// concat() method appends the string at end
    	System.out.println(s);// it will print only "Garima" as we know strings are immutable objects.
    	
    	/* Here "Garima" will not change but a new string object "Garima Srivastava" will be created. But the variable s will always refer to the "Garima" not " Garima Srivastava"
    	  * But if we will explicitely assign it to the reference variable, it will refer to "Garima Srivastava".
    	  */
    	
    	
    	s=s.concat("Srivastava");//Explicitely assigning it to reference variable.
    	System.out.println(s);
    }	
}
 /* String objects are immutable because we are using string literal if there 5 reference variables and all are refers to one object. if reference variables can change the string object then all the variables will be affected thats y string object are immutable.
  * 
  * 
  */

    
    	
    	
   