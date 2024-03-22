package test0322;

import java.util.Arrays;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class Test6_A {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] num= new int[3];
		for(int i=0;i<1000;i++) {
			int f = (int)(Math.random() * arr.length);
			int t = (int)(Math.random() * arr.length);
			int tmp = arr[f];
			arr[f] = arr[t];
			arr[t] = tmp;
		}
		for(int i=0;i<num.length;i++) {
			num[i] = arr[i];
		}
		//정렬
		/*
		for(int i=0;i<num.length;i++) { 
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		*/
		Arrays.sort(num);
		for(int n : num)	System.out.print(n);
		System.out.println();
	}
	
}
