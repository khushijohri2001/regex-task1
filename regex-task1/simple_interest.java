//*Q.1: Write a program to calculate simple interest (make sure to take principle amount, interest rate and time period from console)*/



import java.util.Scanner;

public class simple_interest {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter Principle Amount: ");
		float principle= sc.nextFloat();
		
		System.out.println("Enter Interest Rate: ");
		float rate= sc.nextFloat();
		
		System.out.println("Enter Time Period: ");
		float time= sc.nextFloat();
		
		float si=principle*rate*time;
		
		System.out.println("The Simple Interest is: Rs. " + si);
		
		

	}

}
