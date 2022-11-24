package java_prgm;

public class Method1 {

	public static int sum()
	{
		int sum=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
			sum=sum+i;
			System.out.println(i);
		}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum());
		
	}
}
