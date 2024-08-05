/*
	Q5.Print the Table of 'N',take the 'N' from user.
*/
import java.util.Scanner;
class TableNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number N : ");
		int n = sc.nextInt();
		for(int i=1; i<=10; i++){

			System.out.print((i*n) + " ");
		}
		System.out.println();
	}
}
/* Output :

Enter the Number N : 2
2 4 6 8 10 12 14 16 18 20
*/
