/*
	
   1 4 9 16 25
   1 4 9 16 25
   1 4 9 16 25
   1 4 9 16 25
   1 4 9 16 25
*/

import java.util.Scanner;
class Pattern5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Row & Column: ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){

			for(int j=1; j<=n; j++){
				System.out.print((j*j) + " ");
			}
			System.out.println();
		}
	}
}


