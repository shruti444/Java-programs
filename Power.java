
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		int num, power, res=1, originalPower;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base number: ");
		num = sc.nextInt();
		System.out.println("Enter the power of number: ");
		power = sc.nextInt();
		originalPower = power;
		while(power!=0)
		{
			res = res * num;
			--power;
		}
		
		System.out.println("Power "+originalPower+" to "+num+" is "+res);
		
	}

}
