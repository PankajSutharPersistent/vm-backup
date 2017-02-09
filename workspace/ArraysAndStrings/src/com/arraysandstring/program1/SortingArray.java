package com.arraysandstring.program1;

public class SortingArray {

	/**
	 * @param args
	 */
	static int[] sortArray(int[] arr){
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrlist[]={9,6,3,22,5,8,7,4,1,0};
		int[] arrListAfterSort=sortArray(arrlist);
		System.out.println("Sorted List");
		for(int i=0;i<arrListAfterSort.length;i++)
		{
			System.out.println(arrListAfterSort[i]);
		}
		}

}
