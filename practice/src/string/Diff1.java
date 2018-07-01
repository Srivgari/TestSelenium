package string;
//string class and String Buffer difference
public class Diff1
     {
          public static void stringConcat() {
        	  String s1="java";
        	  for(int i=0;i<=10000;i++) {
        		  s1=s1+"new";
        	  }
          }
          
          public static void stringBufferConcat() {
        	   StringBuffer sb1= new StringBuffer("Mava");
        	   for(int i=0;i<10000;i++) {
        		   sb1.append("old");
        	   }
          }
          
          public static void main(String[]args) {
        	  long startTime= System.currentTimeMillis();
        	  stringConcat();
        	  System.out.println("Time taken by String:"+(System.currentTimeMillis()-startTime)+"ms");
        	  startTime= System.currentTimeMillis();
        	  stringBufferConcat();
        	  System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+"ms");
        	  
          }
      }
