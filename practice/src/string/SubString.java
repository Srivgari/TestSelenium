package string;

 /*Substring- A part of string is called substring. substring is a subset of another string.in case of substring 
  * startIndex is inclusive and endIndex is exclusive.
  * we can get substring by two methods-
  * public String substring(int startIndex)
  * public String substring (int startIndex, Int endIndex)
  *  
  */
public class SubString {
  public static void main(String[]args) {
	  String s="Hello";
	    System.out.println(s.substring(2));
	    System.out.println(s.substring(1,3));
  }
}
