package test0320;

import java.util.Scanner;

/*
1.   한개의 문자를 입력받아 ch 변수에 저장하고
     ch 문자가 
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을  출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
[결과]
한개의 문자를 입력하세요
A
A : a

한개의 문자를 입력하세요
b
b : B

한개의 문자를 입력하세요
1
1 : 21

한개의 문자를 입력하세요
-
- :기타문자
*/
public class Test1_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		char ch = scan.next().charAt(0); 
		System.out.print(ch+":");
		if(ch >= 'A' && ch <= 'Z') {
			 System.out.println((char)(ch+32));
		} else if (ch >= 'a' && ch <= 'z') {
			 System.out.println((char)(ch-32));
		} else if (ch >= '0' && ch <= '9') {
			 System.out.println((ch-'0') + 20);
		} else {
			System.out.println("기타문자");
		}
	}
}
