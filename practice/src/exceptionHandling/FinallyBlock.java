package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try{
			int a= 50/0;
			
		}catch(NullPointerException e) {
			System.out.println("Not handled");
		}
		finally{System.out.println("Finally always executes");}

	}

}
