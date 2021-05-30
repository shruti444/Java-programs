import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,i,temp,sum=0;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			i=n%10;
			sum=sum+(i*i*i);
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is armstrong number");
		else
			System.out.println(temp+" is not armstrong number");
	}

}
