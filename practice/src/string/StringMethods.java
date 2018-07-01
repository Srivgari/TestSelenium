package string;

/*
 * All the methods which are present in String class are given below.
 */
public class StringMethods {

	public static void main(String[]args) {
		String s="Sachin";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.startsWith("S"));
		System.out.println(s.endsWith("n"));
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		String s1=s.intern();//when intern method is invoked, if the pool already contains a string equal to this
		/*String object as determined by the equals(object) method ,then the string from the pool is returned. otherwise this string object is added to the pool and a reference to this string object is returned.
		 */
		System.out.println(s1);
		int a=10;
		String s2=String.valueOf(a);//the valueOf() method converts given type such as int,long,float, double,boolean,char,and char array into string.
		System.out.println(s2+10);
		String s3="java is a programming language.java is a platform.java ia an Island";
		String s4=s3.replace("java","mava");
		System.out.println(s4);
		
	}
}

