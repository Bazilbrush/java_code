package arrays;

import java.util.Arrays;
import java.util.Random;
public class run {
	
	

	public static void main(String[] args) {
		int[] arr1 = new int [1000000];
		for (int i= 0; i<arr1.length; i++){
			arr1[i] = (int)(Math.random()*9999);
		}
		System.out.println("original"+Arrays.toString(arr1));
		
		//Arrays.sort(arr1);
		
		//int index = Arrays.binarySearch(arr1, 322);
		//;
		
		//int findHigh = arr1[arr1.length-1];
		//System.out.println(findHigh);
		//int findLow = arr1[0];
		//System.out.println(findLow);
		quicksort x = new quicksort();
		//x.partition(arr1);
		//int a = x.partition(arr1, 0, arr1.length-1);
		//System.out.println(a);
		x.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		//for(int i:arr1){
		//	System.out.println(i);
		//}
		/*try{
			int c  =50 /0;
		System.out.println(c);
		}
		catch(ArithmeticException AS){
			System.out.println("cant div by 0");
		}*/
		
	}

}
