package java_prgm;

import java.util.Scanner;

public class Scanner_class {
	public static int add(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter the number");
		int a=sc.nextInt();
		if(a%7==0)
		{
			System.out.println(a +" is divisible by 7");
		
		}
		else
		{
			System.out.println(a +" not is divisible by 7");
		}*/
		System.out.println("enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(Scanner_class.add(a, b, c));
		

	}

}
