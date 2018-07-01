package string;
/* String- In java, String is an object that represents sequence of char values enclosed within the double quotes. An array of character works same as java string. To create and manipulate the strings java provides three classes -
 * 1- java.lang.String
 * 2- java.lang.StringBuffer
 * 3- java.lang.StringBuilder
 * All the three classes are member of java.lang and they are final classes. means we can't create subclasses of these classes.
 * All the three classes implements the serializable and CharSequence interface.
 * java.lang.String is immutable in java. means once we create the object we cannot modify the string if we try to modify the string a new object will create with the modification.
 * java.lang.Stringbuffer and java.lang.StringBuilder are mutable means we can modify the existing object.
 * 
 * There are two ways to create an string- 1- By String literal- we use string literal to make java more memory efficient(because no new objects are created if it is already exists in string constant pool. 
 *                                         2- By new keyword - JVM will create new string object in normal (non pool) heap area and literal will be place in string constant pool. The variable  will refer the object in heap(non pool).
 *                                         
  */
public class StringCreate {
   public static void main(String[]args) {
	   
	   String s1="Garima";//Creating String object by Using String Literal
	   System.out.println(s1);
	//   String s3="Garima";//Creating String object by Using String Literal
	 //  System.out.println(s3);
	   String s2=new String("Garima");// By Using new keyword
	   System.out.println(s2);
   }
}
