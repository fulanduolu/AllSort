package insert;

/**
 * 插入排序
 * @author Administrator
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {234,57,23,89,12};
		Insert(arr);
		for(int c:arr){
			System.out.print(c+" ");
		}
	}
	
	/**
	 * 插入排序的核心代码
	 */
	public static void Insert(int[] arr) {
		int target= 0;
		// 假设第一个位置上已经是有序的，此时只需要将后面的位置排序就好
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			target=arr[i];
			//前一个比这个小
			while(j>0 && target<arr[j-1]){
				//如果后一个比前一个小，则进行换位置
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=target;
		}
	}
	
}
