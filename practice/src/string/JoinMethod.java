package string;

public class JoinMethod {

	public static void main(String[] args) {
		/*join() method returns a  string joined with the given delimiter. delimiter will be copied for each element.
		 * in case of null element.'null' is added. The join() method is included in java since jdk1.8
		 * 		 
		 */
		
		String s1=String.join("@","My","name","is","Garima");
		System.out.println(s1);
		

		String s2=String.join(" ","My","name","is","Garima");
		System.out.println(s2);

	}

}
