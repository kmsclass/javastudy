package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자형 문자열을 입력받아서 각 자리수의 합을 출력하기
 *  
 * [결과]
 * 숫자를 입력하세요
 * 1234
 * 1+2+3+4 = 10
 */
public class Exam5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String in1 = scan.next();
//		 첫번째 숫자 : in1.charAt(0) - '0': => 숫자값1 
//		 두번째 숫자 : in1.charAt(1) - '0': => 숫자값2 
//		 세번째 숫자 : in1.charAt(2) - '0': => 숫자값3 
		// 숫자값1 + 숫자값2 + 숫자값3 => 자리수의 합
		// 문자열의 : in1.length()
		int sum = 0;
		for (int i=0;i < in1.length();i++) {
			System.out.print(in1.charAt(i) + ((i==in1.length()-1)?"=":"+"));
			sum += in1.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
