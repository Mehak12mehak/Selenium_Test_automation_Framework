package java_prgm;

public class If_Else_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=20;
		if(marks>=85)
		{
			System.out.println("distinction");
		}
		else if(marks>=65&&marks<85)
		{
			System.out.println("first class");
		}
		else if(marks>=35&&marks<65)
		{
			System.out.println("third class");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
