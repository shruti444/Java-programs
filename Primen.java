import java.util.Scanner;

public class Primen {

	public static void main(String[] args) {
		int num,i,j,counter;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(j=2;j<=num;j++)
		{
			counter=0;
			for(i=2;i<=j;i++)
		        if(j%i==0)
		        	counter++;
			if(counter==1)
				System.out.println(j+" ");
		}
		

	}

}

