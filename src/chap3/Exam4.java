package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수인 경우 양수, 음수인 경우 음수 0인 경우 영을 출력하기
 * [결과]
 * 숫자를 입력하세요
 * -10
 * -10:음수
 */
public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		System.out.println(num+":"+((num>0)?"양수":(num < 0)?"음수":"영"));
	}
}
