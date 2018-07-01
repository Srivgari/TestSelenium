package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			//  int i=50/0;
			  int[] a=new int[5];
			  a[10]= 50;
		}catch(ArithmeticException e) {System.out.println("case1");}
		  catch(NullPointerException e) {System.out.println("case2");}
		  catch(NumberFormatException e) {System.out.println("case3");}
		  catch(ArrayIndexOutOfBoundsException e) {System.out.println("case3");}
		  System.out.println("rest of the code executed");
	}

	}
