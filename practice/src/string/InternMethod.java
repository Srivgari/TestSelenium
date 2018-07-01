package string;

public class InternMethod {
     /*intern() returns the value of interned string. It can be use to return the string from pool memory,if it is created by new keyword.
      * 
      */
	public static void main(String[] args) {
		
        String s1= new String("Hello");
        String s2="Hello";
        String s3=s1.intern();
        System.out.println(s3==s2);
        System.out.println(s1==s3);//why this one is not equal.
        System.out.println(s2==s3);
        System.out.println(s3);
        System.out.println(s1);
		
		
	}

}
