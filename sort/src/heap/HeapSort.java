package heap;

/**
 * ������
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
	 * ����Ķ�����Ĺ�ģ
	 */
	public static void maxHeap(int[] arr,int parentNodeIndex,int heapSize){
		//��ڵ������
		int leftChildNodeIndex = parentNodeIndex*2;
		//�ҽڵ������
		int rightChildNodeIndex = parentNodeIndex*2+1;
		//���ڵ������
		int largestNodeIndex = parentNodeIndex;
		
		//�����ڵ���ڸ��ڵ㣬����ڵ�����Ϊ���ڵ�
		if(leftChildNodeIndex<=heapSize && arr[leftChildNodeIndex-1]>arr[largestNodeIndex-1]){
			largestNodeIndex = leftChildNodeIndex;
		}
		
		//����ҽڵ������ӽڵ����ô����ӽڵ�Ӧ�������ӽڵ�
		if(rightChildNodeIndex<heapSize && arr[rightChildNodeIndex-1]>arr[largestNodeIndex-1]){
			largestNodeIndex = rightChildNodeIndex;
		}
		
		//�������ӽڵ��븸�ڵ㲻һ��������
		if(largestNodeIndex!=parentNodeIndex){
			int temp = arr[parentNodeIndex-1];
			arr[parentNodeIndex-1]=arr[largestNodeIndex-1];
			arr[largestNodeIndex-1] = temp;
			
			//�������,��֤�Ƿ������������
			maxHeap(arr, largestNodeIndex, heapSize);
		}
		
	}
	
}
