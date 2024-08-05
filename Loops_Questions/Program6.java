/*
	Q6.Print the Power of Number.
	i/p: n = 5,pow = 4
	o/p: ans = 625.
*/
import java.util.Scanner;
class PowerOfNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number N : ");
		int n = sc.nextInt();
		System.out.print("Enter the Power N : ");
		int pow = sc.nextInt();

		//Way : 1
		/*int ans = 1;
		for(int i=1; i<=pow; i++){

			ans = ans*n;
		}
		System.out.println("Power of Number : " + ans);
		*/
		
		//Way : 2
		int num = n;
		for(int i=1; i<pow; i++){
			num = num * n;
		}
		System.out.println("Power of Number : " + num);
	}
}
/* Output :

Enter the Number N : 5
Enter the Power N : 4
Power of Number : 625
*/
