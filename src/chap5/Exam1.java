package chap5;

import java.util.Scanner;

/*
 * int값 5개를 저장할 수 있는 배열을 생성하고
 * 화면에서 5개의 값을 입력받아
 * 입력받은 수의 합계, 평균,최대값,최소값, 최대값의 인덱스, 최소값의 인덱스 출력하기
 * [결과]
 * 5개의 정수를 입력하세요
 * 1 2 3 4 5
 * 합계: 15
 * 평균: 3
 * 최대값:5
 * 최소값:1
 * 최대값인덱스:4
 * 최소값인덱스:0
 */
public class Exam1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요");
		int sum=0,maxindex=0,minindex=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			if(arr[maxindex] < arr[i]) maxindex=i;
			if(arr[minindex] > arr[i]) minindex=i;
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+(double)sum/arr.length);
		System.out.println("최대값:"+arr[maxindex]);
		System.out.println("최소값:"+arr[minindex]);
		System.out.println("최대값인덱스:"+maxindex);
		System.out.println("최소값인덱스:"+minindex);
	}
}
