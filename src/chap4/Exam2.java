package chap4;

import java.util.Scanner;

/*
 * 화면에서 문자를 입력받아서 대문자/소문자/숫자/기타문자인지 출력하기
 * 대문자 : 'A'<= ch <='Z' => ch >= 'A' && ch <= 'Z'
 * 소문자 : 'a'<= ch <='z' => ch >= 'a' && ch <= 'z'
 * 숫자   : '0'<= ch <='9' => ch >= '0' && ch <= '9'
 * 그외 기타문자
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		//String scan.next() : 입력받은 데이터를 문자열로 인식함 
		//String.charAt(index) : 문자열내에서 index에 해당하는 char데이터를 리턴
		// index : 0부터 시작. 
		char ch = scan.next().charAt(0); //화면에서 문자열을 입력받아 첫번째 char값을 ch변수에 저장 
//		System.out.println(ch+":"+"대문자");
		System.out.print(ch+":");
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}
	}
}
