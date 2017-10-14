package heap;

/**
 * 堆排序
 * @author Administrator
 *
 */
public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {234,57,23,89,12};
		heapSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void heapSort(int[] arr){
			createMapHeap(arr);
			for(int i = arr.length ; i>1;i--){
				int temp = arr[0];
				arr[0]=arr[i-1];
				arr[i-1] = temp;
				maxHeap(arr,1,i-1);
			}
	}
	
	public static void createMapHeap(int[] arr){
		for(int i = arr.length/2 ;i>0;i--){
				maxHeap(arr,i,arr.length);
		}
	}
	
	/**
	 * 放入的堆排序的规模
	 */
	public static void maxHeap(int[] arr,int parentNodeIndex,int heapSize){
		//左节点的索引
		int leftChildNodeIndex = parentNodeIndex*2;
		//右节点的索引
		int rightChildNodeIndex = parentNodeIndex*2+1;
		//最大节点的索引
		int largestNodeIndex = parentNodeIndex;
		
		//如果左节点大于父节点，则将左节点设置为最大节点
		if(leftChildNodeIndex<=heapSize && arr[leftChildNodeIndex-1]>arr[largestNodeIndex-1]){
			largestNodeIndex = leftChildNodeIndex;
		}
		
		//如果右节点比最大子节点大，那么最大子节点应当是右子节点
		if(rightChildNodeIndex<heapSize && arr[rightChildNodeIndex-1]>arr[largestNodeIndex-1]){
			largestNodeIndex = rightChildNodeIndex;
		}
		
		//如果最大子节点与父节点不一样，交换
		if(largestNodeIndex!=parentNodeIndex){
			int temp = arr[parentNodeIndex-1];
			arr[parentNodeIndex-1]=arr[largestNodeIndex-1];
			arr[largestNodeIndex-1] = temp;
			
			//交换完毕,验证是否符合最大堆特性
			maxHeap(arr, largestNodeIndex, heapSize);
		}
		
	}
	
}
