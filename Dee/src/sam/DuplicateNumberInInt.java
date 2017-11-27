package sam;

import java.util.Scanner;

public class DuplicateNumberInInt 
{
	public static void main(String args[]){
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
		
		for(int i = 0; i<arr_size; i++)
		{
			for(int j= i+1; j<arr_size; j++){
				 if (arr[i] == arr[j]) {
	                    System.out.print(arr[i] + " ");
				
				 }
			}
		}
		
		
	}

}
