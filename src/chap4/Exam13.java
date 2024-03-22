package chap4;

import java.util.Scanner;

/*
 * 화면에서 999 숫자가 입력될때 까지 숫자를 입력받아서 입력받은 수의 합을 출력하기
 * [결과]
 * 숫자들을 입력하세요(종료:999)
 * 1 5 6 9 999
 * 21
 */
public class Exam13 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("숫자를 여러개 입력하세요(종료:999)");
		Scanner scan = new Scanner(System.in);
		while(true) { //무한반복. 반복문 내부에서 break로 반복종료함. 
			int num = scan.nextInt(); 
			if(num == 999)	break;
			System.out.print(num + " ");
			sum += num; 
		}
		System.out.println("=>입력받은 수의 합:" + sum);
	}
}