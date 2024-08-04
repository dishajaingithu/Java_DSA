/*
	Type Conversion and Casting :
*/

class TypeCasting{
	public static void main(String[] args){
		//Automatic type promotion in expression
		byte a = 40;
		byte b = 50;
		byte c = 100;
		int d = (a*b)/c;
		System.out.println(d);		//20

		int num = 'a';
		System.out.println(num);	//97
	}
}
/* Output :

20
97
*/
