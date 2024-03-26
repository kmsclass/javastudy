package test0322;

import java.util.Scanner;

/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/
public class Test3_A {
	public static void main(String[] args) {
		int[] digit = {2,8,10,16}; //진수 배열
		char[] numarr = "0123456789ABCDEF".toCharArray();
		char[] arr; //결과값 저장 배열
		System.out.println("10진수 값을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index=0;
		for (int d : digit) { //d=10 
			divnum = num;
			index = 0;
			arr = new char[32]; 
			while (divnum > 0) {
				arr[index++] = numarr[divnum % d];
				divnum /= d; 
			}
			System.out.print(num + "의 " + d + "진수 :"); 
			for(int i=index-1;i>=0;i--)
				 System.out.print(arr[i]);
			System.out.println();
		}
	}
}