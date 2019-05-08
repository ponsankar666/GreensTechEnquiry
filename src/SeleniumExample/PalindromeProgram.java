package SeleniumExample;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		int a,b = 0,i,j = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		a=scan.nextInt();
		b=a;
		while(a>0)
		{
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			}
		if(b==j)
		{System.out.println("Palindrome");
		}
		else
			System.out.println("Not a palindrome");
		
	}

}
