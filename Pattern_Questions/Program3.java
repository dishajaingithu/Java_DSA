/*
	
   1 2 3 4 5
   1 2 3 4 5
   1 2 3 4 5
   1 2 3 4 5
   1 2 3 4 5
*/

import java.util.Scanner;
class Pattern3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Row & Column: ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){

			for(int j=1; j<=n; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}


