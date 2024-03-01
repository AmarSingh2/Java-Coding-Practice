package com.selenium.DataStructure;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {6,4,2,8,3,1};
		/*
		 * First Iteration - {6,4}
		 * temp=4;
		 * j=0=arr[0] = 6;
		 * arr[j]=arr[0]=6>temp
		 * 
		 * arr[0+1]=arr[0]
		 * arr[1]=6
		 * 
		 * then we store arr[j+1] value to temp
		 * 
		 * 
		 * and so on 
		 * 
		 * Second iteration - {4,6,2}
		 *                    {2,4,6}
		 *                    
		 * Third iteration - {2,4,6,8}
		 * 
		 * Fourth Iteration - {2,4,6,8,3}                   
		 *                    {2,3,4,6,8}
		 *                    
		 * Fifth Iteration - {2,3,4,6,8,1}
		 *                   {1,2,3,4,6,8,}     
		 * 
		 * 
		 */
//		int temp=arr[arr.length-1];
//		int j;
		for(int i=1;i<arr.length;i++) {
			int j;
			int temp=arr[i];
			for( j=i-1;j>=0 && arr[j]>temp;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		
		System.out.print(Arrays.toString(arr)+" ");
	}
}
