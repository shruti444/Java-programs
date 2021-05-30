import java.util.Scanner;

public class Compound {

	public static void main(String[] args) {
		double p,r,t,amt,ci;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter principle amount:");
		p=sc.nextDouble();
		System.out.println("Enter rate:");
		r=sc.nextDouble();
		System.out.println("Enter time:");
		t=sc.nextDouble();
		
		amt=p*Math.pow((1+(r/100)),t);
		ci=amt-p;
		
		System.out.println("Compound Interest is:"+ci);
		System.out.println("Compound Amount is:"+amt);
	}

}
