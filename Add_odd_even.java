import java.util.Scanner;

public class Add_odd_even {

	public static void main(String[] args) {
		int n,e=0,o=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		if(i%2==0)
			e=e+i;
		else 
			o=o+i;
		}
       System.out.println("Addition of even numbers is: "+e);
       System.out.println("Addition of odd numbers is: "+o);
	}

}
