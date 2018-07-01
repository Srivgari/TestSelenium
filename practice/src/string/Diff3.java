package string;

public class Diff3 {

	public static void main(String[] args) {
	  
           long startTime= System.currentTimeMillis();
           StringBuffer buffer=new StringBuffer("Java");
           for(int i=0;i<=10000;i++) {
        	   buffer.append("Language");
           }
           System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+"ms");
           
           
           startTime=System.currentTimeMillis();
           StringBuilder builder=new StringBuilder("Javas");
           for(int i=0;i<=10000;i++) {
        	   builder.append("lang");
        	   
           }
           System.out.println("Time taken by StringBuilder:"+(System.currentTimeMillis()-startTime)+"ms");
	}

}
