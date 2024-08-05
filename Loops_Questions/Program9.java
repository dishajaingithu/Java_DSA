/*
	Q9.Factorial of Number.
*/
import java.util.Scanner;
class FactorialNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number N : ");
		int n = sc.nextInt();

		int fact = 1;
		for(int i=1; i<=n; i++){

			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is : " + fact);
	}
}
/* Output :
	
Enter the Number N : 5
Factorial of 5 is : 120
*/
