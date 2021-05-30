
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num,i,flg=0;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flg=1;
				break;
			}
		}
		if(flg==0)
			System.out.println(num+" is a prime number");
		else 
			System.out.println(num+" is not prime number");
		
		

	}

}
