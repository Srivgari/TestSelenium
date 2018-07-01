package string;

/* We can compare string in java on the basis of content and reference. It is used in authentication, sorting and reference matching.
 * there are 3 ways to compare string-
 * 1- By equals() method- it compares original content of the string. It compares value of string for equality. string class provides two methods-
 * a-public boolean equals(compares this string to the specified object)
 * b-public boolean equalsIgnoreCase(compares this string to another string, ignoring case)
 * 2- By == operator - compares reference not values ,
 * 3- By compareTo() method - It compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
 * if s1=s2 --> 0
 *    s1>s2 --> +ve
 *    s1<s2 --> -ve
 *    
 * 
 */
public class StringCompare {
	
	public static void main(String[]args) {
		
      String s1="Sachin";
      String s2="Sachin";
      String s3="SACHIN";
      String s4=new String("Sachin");
      String s5="Suman";
      
      System.out.println(s1.equals(s2));// it will check content and case also.
      System.out.println(s1.equals(s3));
      System.out.println(s2.equals(s3));
      System.out.println(s1.equalsIgnoreCase(s4));// it will check only content.
      System.out.println(s1.equalsIgnoreCase(s3));
      System.out.println(s1.equals(s4));
      System.out.println(s1.equals(s5));
      System.out.println(s3.equalsIgnoreCase(s4));
      System.out.println(s4.equalsIgnoreCase(s5));
      System.out.println(s1==s3);//it will check content and case also
      System.out.println(s1==s5);
      System.out.println(s1==s2);
      System.out.println(s1==s4);
      System.out.println(s1.compareTo(s2));
      System.out.println(s1.compareTo(s3));// it will give +VE value because the characters ASCII value will be compare means here (ASCII value of a -     // ASCII value of A - (97-65=32))
      System.out.println(s1.compareTo(s4));
      System.out.println(s1.compareTo(s5));
	}
}

