import java.util.Scanner;

public class Greatestnum {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b)
		    if(a>c)
				System.out.println(a+" is greater number");
		if(b>a)
		    if(b>c)
				System.out.println(b+" is greater number");
			else
				System.out.println(c+" is greater number");
		
	}

}
