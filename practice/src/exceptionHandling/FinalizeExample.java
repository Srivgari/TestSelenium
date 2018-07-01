package exceptionHandling;

public class FinalizeExample {

	
	public void finalize() {
		
		System.out.println("Finalixe called");
	}
	
	public static void main(String[] args) {

		FinalizeExample f1=new FinalizeExample();
		FinalizeExample f2=new FinalizeExample();
		//f1=null;
		//f2=null;
		f1.finalize();
		f2.finalize();

		System.gc();
	}

}
