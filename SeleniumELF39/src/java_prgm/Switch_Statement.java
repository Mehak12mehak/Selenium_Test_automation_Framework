package java_prgm;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num=1;
		switch(num)
		{
		case 4 :System.out.println("it is 4");
				break;
		case 5:System.out.println("it is 5");
				break;
		case 3:System.out.println("it is 3");
				break;
		default:System.out.println("Oops!!!invalid number");*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the alphabets");
		
		char vowel=sc.next().charAt(0);
		switch(vowel)
		{
		case 'a':System.out.println("vowel");
					break;
		case 'e':System.out.println("vowel");
		break;
		case 'i':System.out.println("vowel");
		
		break;
		case 'o':System.out.println("vowel");
		break;
		case 'u':System.out.println("vowel");
		break;
		default:System.out.println("consonant");
					
		
		
		}

	}

}
