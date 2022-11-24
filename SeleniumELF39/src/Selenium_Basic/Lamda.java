package Selenium_Basic;

public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*I i=()->
		{
			System.out.println("method-1");
		};
		
		i.m();*/
		/////////////////////////////////////
		
		/*I i=(int c,int d)->{
		int e=c+d;
		System.out.println(e);
	};
	i.m(10,20);
	i.m(40,60);
	*/
		////////////////////////////////////////////
		I i=(int a,int b)->{
			int c=a+b;
			//System.out.println(c);
			return c;
		};
		
		int c = i.m(10,20);
		System.out.println(c);
		
	}

}
