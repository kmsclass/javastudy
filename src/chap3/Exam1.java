package chap3;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int x= 10;
		//++ 연산자를 사용하여 x=10 의 결과가 나오도록 코딩하기
		System.out.println("x="+x++); 
		//-- 연산자를 사용하여 x=10 의 결과가 나오도록 코딩하기
		//x:11
		System.out.println("x="+--x);
		//화면에서 정수를 입력받아 x=입력받은수로 나오도록 코딩하기
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		x = scan.nextInt();//키보드에서 정수형값을 입력받아 x 변수에 저장함
		System.out.println("x="+x++); 
		System.out.println("x="+--x);
		
	}
}
