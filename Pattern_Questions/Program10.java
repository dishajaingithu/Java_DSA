/*
	        1
	      2 2
	    3 3 3
	  4 4 4 4
	5 5 5 5 5
*/
import java.util.Scanner;
class Pattern10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Row & Column : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){

			//Gives the Space
			for(int sp=1; sp<=(n-i); sp++){
				System.out.print("\t");
			}

			for(int j=1; j<=i; j++){
				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}
}
