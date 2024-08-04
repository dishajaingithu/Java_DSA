/*
	Q.Temperature Conversion Program
	  Convert from degree celcius to faranite.
*/

import java.util.Scanner;
class Temperature{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter temp in C : ");
		float tempC = sc.nextFloat();

		float tempF = (tempC * 9/5) + 32;
		System.out.println(tempC + " Temperature in Faranite is " + tempF);
	}
}
/* Output :

Please Enter temp in C : 45
45.0 Temperature in Faranite is 113.0
*/
