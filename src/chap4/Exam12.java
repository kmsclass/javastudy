package chap4;

import java.util.Scanner;

/*
 * while 구문 예제
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
 * 입력횟수:4=>빠르시네요
 * 프로그램을 종료합니다.
 * 
 * ======================
 *   입력횟수가 5번이하인 경우 : 빠르시네요
 *   입력횟수가 10번이하인 경우 : 보통입니다.
 *   입력횟수가 11번이상인 경우 : 노력하세요.
 */
public class Exam12 {
	public static void main(String[] args) {
		int sysnum = (int)(Math.random() * 100) + 1;
		int cnt = 0;
		System.out.println(sysnum);
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100사이의 숫자를 입력하세요");
		while(true) {
			int num = scan.nextInt();
			cnt++;
			if(num > sysnum) {
				System.out.println("작은수입니다.");
			} else if (num < sysnum) {
				System.out.println("큰수입니다.");
			} else if (num == sysnum) {
				System.out.println("정답입니다.");
				System.out.print("입력횟수:"+cnt+"=>");
				System.out.println
				((cnt<=5)?"빠르시네요":(cnt<=10)?"보통입니다.":"노력하세요");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
			
	}
}
