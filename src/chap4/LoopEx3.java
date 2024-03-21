package chap4;

import java.util.Scanner;

/*
 * 정수로 입력받아서 각 자리수의 합을 출력하기
 */
public class LoopEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int innum = scan.nextInt();
		int num = innum;
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(innum +"의 자리수합:"+sum);
	}
}
