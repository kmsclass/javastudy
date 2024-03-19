package chap3;

import java.util.Scanner;

/*
 * 키보드에서 초를 입력받아 몇시간 몇분 몇초인지 출력하기
 * 1. Scanner 객체를 생성 : Scanner scan = new Scanner(System.in);
 * 2. 입력값을 second 변수에 저장 : int second = scan.nextInt();
 * 3. 시간저장 : int h = second/3600
 * 4. 분저장   : int m = (second%3600)/60
 * 5. 초저장   : int s = 
 * 
 * [결과]
 * 초를 입력하세요
 * 3662
 * 1시간1분2초
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int second = scan.nextInt();
		int h = second/3600;
		int m = second%3600/60;
		int s = second%60;
		System.out.println(h+"시간"+m+"분"+s+"초");
	}
}
