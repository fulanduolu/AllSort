package insert;

/**
 * ��������
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
	 * ��������ĺ��Ĵ���
	 */
	public static void Insert(int[] arr) {
		int target= 0;
		// �����һ��λ�����Ѿ�������ģ���ʱֻ��Ҫ�������λ������ͺ�
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			target=arr[i];
			//ǰһ�������С
			while(j>0 && target<arr[j-1]){
				//�����һ����ǰһ��С������л�λ��
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=target;
		}
	}
	
}
