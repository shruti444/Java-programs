import java.util.Scanner;

public class Sumofseries {

	public static void main(String[] args) {
		int sum=0,i,n;
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			
			sum=sum+i;
		}
		System.out.println("Sum of series from 1 to "+n+" is :"+sum);

	}

}
