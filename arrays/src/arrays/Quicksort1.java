package arrays;

import java.util.Arrays;


public class Quicksort1 {
	
	public int[] sort(int[] A, int low, int high){
		
		if (low < high){
			int p = partition(A, low, high);
			System.out.println("low "+low);
			System.out.println("high "+high);
			//System.out.println("p1 "+p);
			sort(A, low, p-1);
			//System.out.println("p2 "+p);
			sort(A, p+1, high);
			
		}
		
	return A;
	}
	
	public int partition(int[] A, int low, int high){
		int pivot = high;
		int dispPiv = A[high];
		//System.out.println("pivot value "+dispPiv);
		int j= low-1;
		//System.out.println("pivot pos "+pivot);
		for (int i = low; i<high; i++){
			if (A[i]<= dispPiv){
				j=j+1;
				if (j != i){
					int temp;
					temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				
				//System.out.println("hello"+i);
				//System.out.println("temp"+temp);
				//System.out.println("ai"+A[i]);
				}
			
			}
			int temp;
			temp = A[j+1];
			A[j+1] = A[high];
			A[high] = temp;
			
		}
		System.out.println(Arrays.toString(A));
		//System.out.println("pivot j "+j);
		return j+1;
	}
	
	
}
