package quick;

import java.util.Scanner;

/**
 * ¿ìËÙÅÅĞò
 * @author Administrator
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {234,57,23,89,12};
		quick1(0,arr.length-1,arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void quick1(int start,int end,int[] arr){
		if(start<end){
			int partion = quick(start,end,arr);
			quick1(start,partion-1,arr);
			quick1(partion+1,end,arr);
		}
	}
	public static int quick(int start,int end,int[] arr){
		int i=start;
		int j=end;
		int partion = arr[i];
		while(i<j){
			while(i<j && arr[j]>=partion){
				j--;
			}
			arr[i] = arr[j];
			while(i<j && arr[i]<partion){
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i]=partion;
		return i;
	}
	
}
