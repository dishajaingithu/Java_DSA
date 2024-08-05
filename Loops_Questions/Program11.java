/*
	Q11.Fibonnaci Series of Number.
*/
import java.util.Scanner;
class FibonnaciSeriesNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number N : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;
		while(count<=n){
			int temp = b;
			b = b+a;
			a = temp;
			count++;
		}
		System.out.println("Fibbonaci of " + n + " is : " + b);
	}
}
/* Output :
	
Enter the Number N : 6
Fibbonaci of 6 is : 8
*/
