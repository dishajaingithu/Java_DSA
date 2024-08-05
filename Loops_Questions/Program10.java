/*
	Q10.Check a Number is Prime or Not.
*/
import java.util.Scanner;
class PrimeNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number N : ");
		int n = sc.nextInt();
		int flag = 0;
		if(n<2){
			System.out.println(n + " is Not Prime");
		}else{
			for(int i=2; i<n; i++){

				if(n%i == 0){
					flag = 1;
					System.out.println(n + " is Not Prime Number");
					break;
				}
			}
			
		}
		if(flag == 0){
			System.out.println(n + " is a Prime Number");
		}
	}
}
/* Output :
	
Enter the Number N : 10
10 is Not Prime Number

Enter the Number N : 2
2 is a Prime Number
*/
