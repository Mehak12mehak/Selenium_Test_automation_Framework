package java_prgm;

public class Method_overloading_Basedon_ReturnType {
	
	public static int add(int a)
	{
		System.out.println(a);
		return a;
	}
	public static float add(float f)
	{
		System.out.println(f);
		return f;
	}
	public static String add(String s)
	{
		System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10);
		add(10.3f);
		add("mahi");

	}

}
