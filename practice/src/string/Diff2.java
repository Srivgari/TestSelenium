package string;
//string class and stringBuffer class diference (hashcode test)
public class Diff2 {
        public static void main(String[]args) {
        	System.out.println("Hashcode test for string");
            String s1="java";
            System.out.println(s1.hashCode());
               s1=s1+"new";
            System.out.println(s1.hashCode());
            
            System.out.println("Hashcode test for stringBuffer");      
              StringBuffer sb= new StringBuffer("java");
              System.out.println(sb.hashCode());
              sb.append("new");
              System.out.println(sb.hashCode());
           
        }
}
