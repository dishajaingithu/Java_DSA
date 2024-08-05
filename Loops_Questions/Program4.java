/*
	Q4.Print the Numbers from 1 to 100.but the pattern of output is 1,4,7,10,....,100.
*/
class NNumber{
	public static void main(String[] args){
		for(int i=1; i<=100; i+=3){

			System.out.print(i + " ");
		}
		System.out.println();
	}
}
/* Output :

1 4 7 10 13 16 19 22 25 28 31 34 37 40 43 46 49 52 55 58 61 64 67 70 73 76 79 82 85 88 91 94 97 100
*/
