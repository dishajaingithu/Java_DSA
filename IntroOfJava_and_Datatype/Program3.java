/*
	Data Type :

	1) Primitive Data Type:
		* Primitive data type is a type that we can't break the data.
		* Have the Specific memory(fixed Memory).
		* ex.Boolean,Byte,Short,Integer,Double,Char,Float,Long.
*/
class PrimitiveDataType{
	public static void main(String[] args){

		int rollNo = 10;
		char letter = 'R';
		float marks = 98.62f;
		double largeDecimalNumber = 4567654.4567;
		long largeIntegerNumber = 34567834567876543L;
		boolean check = false;

		System.out.println("Integer : " + rollNo);
		System.out.println("Character : " + letter);
		System.out.println("Float : " + marks);
		System.out.println("Double : " + largeDecimalNumber);
		System.out.println("Long : " + largeIntegerNumber);
		System.out.println("Boolean : " + check);
	}
}
/* Output :	

Integer : 10
Character : R
Float : 98.62
Double : 4567654.4567
Long : 34567834567876543
Boolean : false
*/
