package java_prgm;

public class Method_overloading_basedon_dataType {
	
	public static void add(int a)
	{
		System.out.println("addition"+a);
	}
	public static void add(float b)
	{
		System.out.println("addition"+b);
	}
	public static void add(double b)
	{
		System.out.println("addition"+b);
	}
	public static void add(String s)
	{
		System.out.println("addition"+s);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(10);
		add(10.2f);
		add(10.67);
		add("mehak");
	}

}
