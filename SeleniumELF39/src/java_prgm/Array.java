package java_prgm;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a.length);*/
		
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			 sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

}