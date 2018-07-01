package string;

public class IndexOfMethod {
    /*indexOf() returns the index of the given character or substrring.If it is not found it returns -1. index count starts from 0
     */
	public static void main(String[] args) {
		
		String s1="old is gold";
		int index1=s1.indexOf("old");
		int index2=s1.indexOf("g");
		System.out.println(index1+" "+index2);
		
        int index3=s1.indexOf("o",5);
        System.out.println(index3);
	}

}
