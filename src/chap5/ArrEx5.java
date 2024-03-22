package chap5;

import java.util.Scanner;

/*
 * 10진수를 16진수로 변환하기
 * 10진수 : 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 * 16진수 : 0 1 2 3 4 5 6 7 8 9 A B C D E F => 정수형 배열 사용 불가
 */ 
public class ArrEx5 {
	public static void main(String[] args) {
		//toCharArray() : 문자열의 데이터를 char[]로 변환
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8];
		System.out.println("16진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		while(divnum > 0) {
			hex[index++] = data[divnum%16];
			divnum /=16;
		}
		System.out.print(num+"의 16진수:");
		for(int i=index-1;i>=0;i--) System.out.print(hex[i]);
		System.out.println();
		System.out.println("Integer 클래스를 이용한 16진수 변환");
		System.out.println(Integer.toHexString(num));
	}
}
