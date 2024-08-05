/*
	Q8.Sum of Square of 'N' Natural Number.
*/
import java.util.Scanner;
class SumOfSquareNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number N : ");
		int n = sc.nextInt();

		int sum = 0;
		for(int i=1; i<=n; i++){

			sum = sum+(i*i);
		}
		System.out.println("Sum of Square of Natural Number is : " + sum);
	}
}
/* Output :
	
Enter the Number N : 5
Sum of Square of Natural Number is : 55
*/
