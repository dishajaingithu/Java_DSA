/*
	Take input using Scanner Class
*/
import java.util.Scanner;
class Input{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt());//take the int input and print
		System.out.println(sc.next());//take the string input and print
		System.out.println(sc.nextDouble());//take the double input and print
	}
}

