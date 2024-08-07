/*
	a a a a a
	b b b b b
	c c c c c 
	d d d d d 
	e e e e e
*/
import java.util.Scanner;
class Pattern6{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		System.out.print("Enter the No Row & Column : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	}
}
