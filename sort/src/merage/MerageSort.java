package merage;

/**
 * �鲢����
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
	 * ����
	 */
	public static void sort(int start,int end,int[] arr){
		//���ֻʣ��һ��Ԫ��
		if(start>=end){
			return;
		}
		//�ҳ��м�Ԫ��
		int midle = (start+end)/2;
		//�����Ԫ�ؽ��еݹ�
		sort(start,midle,arr);
		//���ұ�Ԫ�ؽ��еݹ�
		sort(midle+1,end,arr);
		//���кϲ�
		merage(start,midle,end,arr);
	}
	/*
	 * ���кϲ�
	 */
	public static void merage(int start,int midle,int end,int[] arr){
		//����һ����ʱ����
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
		
		//������ʣ��Ĳ��֣����η�����ʱ����
		while(center<=end){
			//��ʱ��ʾ�ұ�ʣ��
			tempArr[temp++]=arr[center++];
		}
		
		while(start<=midle){
			tempArr[temp++]=arr[start++];
		}
		
		//������ʱ�����д�ŵı�Ϊ�Ѿ�����õ�����,��ʱ����ʱ�����е�Ԫ��ȫ�����ƻص�ԭ������
		while(flag<=end){
			arr[flag] = tempArr[flag++];
		}
	}
	
}
