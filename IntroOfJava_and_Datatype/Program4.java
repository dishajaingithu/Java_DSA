/*
	Q.Sum of Two Number.Take the Input from User.
*/
import java.util.Scanner;
class SumOfTwoNumber{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();

		int ans = num1 + num2;
		System.out.println("Addition of " + num1 + " & " + num2 + " is : " + ans);
	}
}
/* Output :

Enter Number 1 : 10
Enter Number 2 : 20
Addition of 10 & 20 is : 30
*/
