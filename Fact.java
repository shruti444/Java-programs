import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int i,fa=1,a;
		System.out.println("Enter any number=");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			
			fa=fa*i;
			
		}
		System.out.println("Factorial of "+a+" is:"+fa);
		

	}

}

