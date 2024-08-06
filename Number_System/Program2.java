/*
	Q.Binary to Decimal

	1101 -> 13
*/

import java.util.Scanner;
class BinaryToDecimal{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary Number : ");
		int binary_num = sc.nextInt();
		int num = binary_num;
		int ans = 0;
		int power = 1; //Power of 2

		while(binary_num > 0){
			int unit_digit = binary_num % 10;
			ans = ans + (unit_digit*power);
			binary_num /= 10;
			power *= 2;
		}
		System.out.println("Decimal of " + num + " is " + ans + ".");
	}
}
