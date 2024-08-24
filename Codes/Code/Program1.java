/*
	Majority Element :

	Input 1: [3,2,3]
	output 1: 3

	Input 1:[2,2,1,1,1,2,2]
	output 1:2
*/

import java.util.Scanner;
class MajorityEle{

	static void majorityElement(int[] arr){
		int Count1 = 0;
		int indexValue = -1;
		int n = arr.length;
		for(int i=0; i<n; i++){

			int Count2 = 0;
			for(int j=0; j<n; j++){

				if(arr[i] == arr[j]){
					Count2++;
				}
				if(Count2>Count1){
					Count1 = Count2;
					indexValue = i;
				}
			}
		}

		if(Count1 > n/2){
			System.out.println(arr[indexValue]);
		}else{
		 	System.out.println("No element");
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter Array Elements : ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		majorityElement(arr);
	}
}

