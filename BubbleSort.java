package com.selenium.DataStructure;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {6,4,2,8,3,1};
		
		/** In bubble sort we compare two index at one time and find out whichever is smallest it get replaced to left end of an array
		 * First Iteration - {4,2,6,3,1,8}
		 * Second Iteration - {2,4,3,1,6,8}
		 * Third Iteration - {2,3,1,4,6,8}
		 * Fourth Iteration - {2,1,3,4,6,8}
		 * Fifth Iteration - {1,2,3,4,6,8}
		 */
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {  // Improvised bubble sort by minus i because at the end of array the element is already sorted so we minus i in the loop
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
