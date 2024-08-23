/*
	Sort Colors :
	Input 1: nums = [2,0,2,1,1,0]
	output 1: [0,0,1,1,2,2]

	Input 2:[2,0,1]
	output 2:[0,1,2]
*/

import java.util.Scanner;
class SortColors{
	static void sortColors(int[] arr){
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;

		for(int i=0; i<arr.length; i++){

			if(arr[i] == 0){
				count0++;
			}
			if(arr[i] == 1){
				count1++;
			}
			if(arr[i] == 2){
				count2++;
			}
		}

		int i=0; 
		while(count0 > 0){
			arr[i] = 0;
			count0--;
			i++;
		}
		while(count1 > 0){
			arr[i] = 1;
			count1--;
			i++;
		}
		while(count2 > 0){
			arr[i] = 2;
			count2--;
			i++;
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

		sortColors(arr);

		System.out.print("Sort Colors : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
