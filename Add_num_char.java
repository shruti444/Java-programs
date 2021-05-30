import java.util.Scanner;

public class Add_num_char {

	public static void main(String[] args) {
		int a,b,res1;
		String ch1,ch2;
		System.out.println("Enter any two numbers:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		res1=a+b;
		System.out.println("Addition of two numbers is="+res1);
		
		System.out.println("-----------------------------------");
		System.out.println("Enter any two characters:");
		
		ch1=sc.next();
		ch2=sc.next();
		
		System.out.println("Addition of two characters="+ch1+ch2);
		}
}
