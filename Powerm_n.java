import java.util.Scanner;

public class Powerm_n {

	public static void main(String[] args) {
		double m,n,p;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		m=sc.nextDouble();
		System.out.println("Enter power to the number:");
		n=sc.nextDouble();
		p=Math.pow(m, n);
		System.out.println(m+" to the power "+n+" is :"+p);
		

	}

}
