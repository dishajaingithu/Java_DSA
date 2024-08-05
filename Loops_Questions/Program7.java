/*
	Q7.Sum of 'N' Natural Number.
*/
import java.util.Scanner;
class SumOfNaturalNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number N : ");
		int n = sc.nextInt();

		//Way 1:
		/*int sum = 0;
		for(int i=1; i<=n; i++){

			sum = sum+i;
		}
		System.out.println("Sum of Natural Num : " + sum);
		*/

		//Way 2:
		int sum = (n*(n+1))/2;
		System.out.println("Sum of Natural Number is : " + sum);
	}
}
/* Output :
	
Enter the Number N : 5
Sum of Natural Num : 15
*/
