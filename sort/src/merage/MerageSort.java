package merage;

/**
 * 归并排序
 * @author Administrator
 *
 */
public class MerageSort {

	public static void main(String[] args) {
		int[] arr = {234,57,23,89,12};
		sort(0,arr.length-1,arr);
		for(int c:arr){
			System.out.print(c+" ");
		}
	}
	
	/*
	 * 排序
	 */
	public static void sort(int start,int end,int[] arr){
		//如果只剩下一个元素
		if(start>=end){
			return;
		}
		//找出中间元素
		int midle = (start+end)/2;
		//对左边元素进行递归
		sort(start,midle,arr);
		//对右边元素进行递归
		sort(midle+1,end,arr);
		//进行合并
		merage(start,midle,end,arr);
	}
	/*
	 * 进行合并
	 */
	public static void merage(int start,int midle,int end,int[] arr){
		//声明一个临时数组
		int[] tempArr = new int[arr.length];
		int center = midle+1;
		int flag = start;
		int temp = start;
		
		while(start<=midle && center<=end){
			if(arr[start]<=arr[center]){
				tempArr[temp++]=arr[start++];
			}else{
				tempArr[temp++]=arr[center++];
			}
		}
		
		//将各自剩余的部分，依次放入临时数组
		while(center<=end){
			//此时表示右边剩余
			tempArr[temp++]=arr[center++];
		}
		
		while(start<=midle){
			tempArr[temp++]=arr[start++];
		}
		
		//现在临时数组中存放的便为已经排序好的数组,此时将临时数组中的元素全部复制回到原来数组
		while(flag<=end){
			arr[flag] = tempArr[flag++];
		}
	}
	
}
