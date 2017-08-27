package sort1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 冒泡排序
 * @author admin
 *
 */
public class MSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<Integer> arr=new ArrayList<Integer>();
		System.out.println("请输入要排序的数字:");
		while(true){
			String ip = scan.nextLine();
			if("exit".equals(ip)){
				//表示退出
				return;
			}
			if("ok".equals(ip)){
				//表示输入完毕
				break;
			}
			try{
				arr.add(Integer.parseInt(ip));
			}catch(Exception e){
				continue;
			}
		}
			sort(arr);
			//此时就是排好序的
			System.out.println(arr);
		
	}
	public static void sort(List<Integer> list){
		for(int i=0;i<list.size();i++){
			for(int j=i;j<list.size();j++){
				if(list.get(j)<list.get(i)){
					int t=list.get(i);
					list.set(i, list.get(j));
					list.set(j, t);
				}	
			}
		}
		
	}
}
