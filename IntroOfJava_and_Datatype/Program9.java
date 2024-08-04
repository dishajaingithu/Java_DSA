/*
	Type Conversion and Casting :
	Rules for type Promotion :

	1) All the byte,short and char promote to Integer.
	2) Any one of the Operand is long then whole is Promote to long same for float and double also
	ex : 3 * 5.6 = 16.8
*/

class TypeCasting{
	public static void main(String[] args){
		
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		double result = (f*b) + (i/c) - (d-s);
		System.out.println((f*b) + " " + (i/c) + " " + (d-s));
		System.out.println(result);
	}
}
/* Output :

238.14 515 -1023.8766
1777.0166146484376
*/
