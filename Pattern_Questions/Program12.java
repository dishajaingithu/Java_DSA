/*
	        A
	      A B
	    A B C
	  A B C D
	A B C D E
*/
import java.util.Scanner;
class Pattern12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Row & Column : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){
			char ch = 'A';
			//Gives the Space
			for(int sp=1; sp<=(n-i); sp++){
				System.out.print("\t");
			}

			for(int j=1; j<=i; j++){
				System.out.print(ch +"\t");
				ch++;
			}
			System.out.println();
		}
	}
}
