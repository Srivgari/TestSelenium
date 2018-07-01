package exceptionHandling;

public class NestedTry {

	 public static void main(String[]args) {
		  try {
			  try {
				  System.out.println("division");
				  @SuppressWarnings("unused")
				int i=40/0;
				  }catch(ArithmeticException e) {System.out.println("case1");
		  }
			  try {
				  System.out.println("array");
				  int[] a=new int[5];
				  a[20]=30;
				  
			  }catch(ArrayIndexOutOfBoundsException e) {System.out.println("case2");}
			  
	 }catch(Exception e) {System.out.println("Handled");
		  
}
	 }
}
