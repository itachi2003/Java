// It is the naive way to clone an array.
//  In this method, we iterate the original array and put each element of the array into another array.


import java.util.Arrays; 
class StudyTonight { 
	public static void main(String args[]) 
	{ 
		int arr[] = {17, 32, 44, 99, 29, 22, 5, 18, 51, 66, 12, 14, 57}; 
		int[] new_array = Arrays.copyOfRange(arr, 3, 11); 
		for (int num : new_array) 
			System.out.print(num + " "); 

	} 
} 


