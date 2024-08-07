/*
 		1
              2 1
            3 2 1
 	  4 3 2 1
	5 4 3 2 1
*/
import java.util.Scanner;
class Pattern13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                System.out.print("Enter No of Row & Column : ");
                int n = sc.nextInt();

		for(int i=1; i<=n; i++){

			for(int sp=1; sp<=(n-i); sp++){
				System.out.print("\t");
			}
			for(int j=1; j<=i; j++){
				System.out.print((i-j+1)+ "\t");
			}
			System.out.println();
		}
	}
}
