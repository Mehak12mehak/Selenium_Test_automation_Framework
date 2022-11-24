package java_prgm;

public class Method3 {
	public static boolean divisible(int a)
	{
		if(a%7==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divisible(7));
		System.out.println(divisible(49));
		System.out.println(divisible(54));
		System.out.println(divisible(3));
		System.out.println(divisible(2));
		System.out.println(divisible(7));

	}

}
