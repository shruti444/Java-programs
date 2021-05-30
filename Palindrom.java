import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
	{
		int n,sum=0,i,a,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=sc.nextInt();
		a=n;
		while(n>0)
		{
			digit=n%10;
			sum=sum*10+digit;
			n=n/10;
		}
		if(a==n)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}

}
