package collection;

import java.util.ArrayList;

public class ArList {

	public static void main(String[] args) {
		
		ArrayList <String> l=new ArrayList<String>();
		 l.add("A");
		 l.add("10");
		 l.add("c");
		 l.add(null);
		 System.out.println(l);
		 l.remove(2);
		 System.out.println(l);
		 l.add(2,"k");
		 l.add("p");
		 System.out.println(l);

	}

}
