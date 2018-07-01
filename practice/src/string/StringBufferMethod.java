package string;

public class StringBufferMethod {
    /*Java stringBuffer class is same as Java string but Java stringBuffer creates mutable string. Java StringfBuffer is thread safe means multiple threads cannot access it simultaneously. So it is safe and will result in an order. 
     * StringBuffer constructor-
     * 1- StringBuffer()- Creates a empty string buffer with the initial capacity 16.
     * 2- StringBuffer(String str)- Create a string buffer with the specified string.
     * 3- StringBuffer(int capacity)- creates an empty string buffer with the specified capacity as length.
     * Methods present in string Buffer class is given below.
     */
	public static void main(String[] args)
	{
		//StringBuffer sb="Hello";// cannot create string by literal in StringBuffer class.
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.append("India");//append() is used to append specified string with the string. The append() method is overloaded like append(char),append(boolean),append(int),append(float),append(double)etc  
		System.out.println(sb);
				
		sb.insert(2,"My");//insert() method is used to insert specified string with this at specified position. the insert method is overloaded as insert(int,char),insert(int,boolean),insert(int,int),insert(int,float),insert(int,double)etc.
		System.out.println(sb);
		
		sb.replace(2,4,"Me");//replace() method used to replace string from specified position.
	    System.out.println(sb);
	    
	    sb.delete(2,4);//delete() method used delete string from specified position.
	    System.out.println(sb);
	    
	   // sb.reverse();//used to reverse the string.
	    //System.out.println(sb);
	    
	    System.out.println(sb.capacity()); //capacity() used to return the current capacity of the buffer.The default capacity of the buffer is 16.
	    sb.ensureCapacity(5);
	    System.out.println(sb.capacity());
	    
	    System.out.println(sb.charAt(3));//charAt() gives the exact character of specified position.
	    
	    System.out.println(sb.length());//length() gives the length of the string.
	    
	    System.out.println(sb.substring(3));//used to return the substring from specified position
	    
	    System.out.println(sb.substring(2,7));//used to return the substring between specified start and end index. 
	   //the index start from 0 and the startIndex is inclusive and the endIndex is Exclusive.
	   /* for example --- s= G a r i m a
	    *                    0 1 2 3 4 5
	    *    startIndex(1)= a
	    *    endIndex(4)= i
	    */
	    
	    
	    
		
	}

}
