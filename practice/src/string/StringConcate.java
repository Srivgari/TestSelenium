package string;
   /*In java string concatenation forms a new string that is the combination of multiple strings. 
    * In java string concatenation is implemented through the StringBuilder (or StringBuffer) class or its append method. String concatenation operator produces a new string by appending the second operand onto tghe end of first operand. the string concatenation operator can concat not only string but its  primitive values also. 
    * there are two ways to concatenate strings-
    * 1- By using + operator- used to add strings.
    * 2- By Using concat() method - concatenates the specified string to the end of current string.
    */
public class StringConcate {

	 public static void main(String[]args) {
		 String s="Sachin"+"Tendulkar";// java compiler transforms this code as-
		 //String s=(new StringBuilder()).append("Sachin").append("Tendulkar").toString();
		 System.out.println(s);
		 
		 String s1=20+30+"Garima"+10+30;
		 System.out.println(s1);
		 
		 String s2="Sachin";
		 String s3="Tendulkar";
		 String s4=s2.concat(s3);
		 System.out.println(s4);
				 
	 }
}
