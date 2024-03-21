package chap4;

import java.util.Scanner;

/*
 * do while 구문 예제 : 한번은 문장 실행. 문장 실행 이후 조건문 검증
 * 숫자 맞추기
 * 컴퓨터가 1 ~ 100사이의 임의의 정수를 저장함
 * 사용자는 컴퓨터의 저장 숫자를 맞추기
 * 시스템 : 37 가정
 * [결과]
 * 1~100사이의 숫자를 입력하세요
 * 50
 * 작은수입니다.
 * 25
 * 큰수입니다.
 * 40
 * 작은수입니다.
 * 37
 * 정답입니다.
 * 프로그램을 종료합니다.
 */
public class LoopEx8 {
	public static void main(String[] args) {
		int sysnum = (int)(Math.random() * 100) + 1;
		System.out.println(sysnum);
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100사이의 숫자를 입력하세요");
		int num = 0;
		do {
			num = scan.nextInt();
			if(num > sysnum) {
				System.out.println("작은수 입니다.");
			} else if (num < sysnum) {
				System.out.println("큰수 입니다.");
			}
		}while(num != sysnum);
		System.out.println("정답입니다.");
		System.out.println("프로그램 종료");
	}
}
