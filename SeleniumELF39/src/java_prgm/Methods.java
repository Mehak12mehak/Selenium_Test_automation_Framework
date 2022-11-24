package java_prgm;

public class Methods {
	
	public static void  add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	public int mul()
	{
		int a=10,b=20,c;
		c=a-b;
		System.out.println(c);
		return 1;
		
	}
	public static void sub(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	public static boolean equal(int x,int y)
	{
		if(x==y)
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
		Methods.add();
		Methods s1=new Methods();
		s1.mul();
		Methods.sub(2, 3);
		boolean b=equal(10,10);
		System.out.println(b);
		

	}

}
