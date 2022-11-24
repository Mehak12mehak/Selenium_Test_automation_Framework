package java_prgm;

public class Method_overloading {
	public static void add(int a)
	{
		System.out.println("addition"+a);
		
	}
	public static void add(int a,int b)
	{
		System.out.println("addition"+a);
		
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("addition"+a);
		
	}
	public static void add(int a,int b,int c,int d)
	{
		System.out.println("addition"+a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub//based on length
		add(10);
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);

	}

}
