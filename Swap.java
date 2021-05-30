import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter A:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter B:");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Swapping of these numbers is: A="+a+" B= "+b);
	}

}
