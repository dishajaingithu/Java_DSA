/*
	a b c d e
	a b c d e
	a b c d e 
	a b c d e 
	a b c d e
*/
import java.util.Scanner;
class Pattern7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Row & Column : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){
			char ch = 'a';
			for(int j=1; j<=n; j++){
				System.out.print(ch + " ");
				ch++;
			}
			ch++;
			System.out.println();
		}
	}
}
