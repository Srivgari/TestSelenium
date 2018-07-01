package string;

public class Exercise {

	public static void main(String[] args) {
		boolean a2=true;
		boolean b2=false;
		int x=42;
		int y=++x;
		System.out.println("the value of X:"+x);//43
		System.out.println("the value of Y:"+y);//43
		int a=1;
		int b=2;
		int c;
		int d;
		c=++b;
		d=a++;
		c++;
		System.out.println("the value of a:"+a);//2
		System.out.println("the value of b:"+b);//3
		System.out.println("the value of c:"+c);//4
		System.out.println("the value of d:"+d);//1
		
		boolean e= a2^b2;
		int a1=1;
		int b1=2;
		int c1=3;
		a1|=4;
		b1 >>=1;
		c1<<=1;
		a1^=c1;
		System.out.println("the value of a1:"+a1);
		System.out.println("the value of b1:"+b1);
		System.out.println("the value of c1:"+c1);
		System.out.println("the value of e:"+e);
				

	}

}
