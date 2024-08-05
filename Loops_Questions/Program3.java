/*
	Q3.Print the Numbers from 'N' to 1.Take the N from user
*/
import java.util.Scanner;
class NNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--){

			System.out.print(i + " ");
		}
		System.out.println();
	}
}
/* Output :

Enter Value of N : 10
10 9 8 7 6 5 4 3 2 1
*/
