/*
	Q.Decimal to Octal

	13 -> 15
*/

import java.util.Scanner;
class DecimalToOctal{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		int decimal_num = sc.nextInt();
		int num = decimal_num;
		int ans = 0;
		int power = 1;

		while(decimal_num > 0){
			int parity = decimal_num % 8;
			ans = ans + (parity*power);
			decimal_num /= 8;
			power *= 10;
		}
		System.out.println("Octal of " + num + " is " + ans + ".");
	}
}
