/*
	        1
	      1 2
	    1 2 3
	  1 2 3 4
	1 2 3 4 5
*/
import java.util.Scanner;
class Pattern11{
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
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
