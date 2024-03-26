package test0322;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
  1. 배열 선언, 생성.
  2. 임의의 수를 10개 배열에 저장
  3. 정렬
  4. 출력
*/
public class Test4_A {
	public static void main(String[] args) {
		//1. 배열 선언, 생성
		int[] num = new int[10];
		//2. 임의의 수 10개 배열 저장
		for (int i = 0; i < num.length; i++) {			
			num[i] = (int) (Math.random() * 100) + 1; //1~100사이의 임의의 수
		}
		//3. 정렬
		
		for (int i = 0; i < num.length; i++) {
			boolean sorted = true;
			for (int j = 0; j < num.length - 1 - i; j++) {
				//swap 알고리즘. 
				if (num[j] > num[j + 1]) { 
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					sorted = false; 
				}
			}
			if(sorted) break; //이미 정렬되어 있음 i반복문을 빠짐
			for(int n : num)
				System.out.print(n+" ");
			System.out.println();
		}

		for(int n : num) System.out.print(n+" ");
		System.out.println();
		Arrays.sort(num);  //정렬하기
		for(int n : num) System.out.print(n+" ");
		System.out.println();
		
	}
}
