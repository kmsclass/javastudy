package chap4;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt(); //55
		if(score >= 60) {  //if 조건문 : 조건문의 결과가 참인 경우만 {} 내용 실행
			System.out.println("합격입니다.");
		}
		//조건 연산자로 변경하기
		System.out.println((score>=60)?"합격입니다":"");
		if(score >=60) { //if else 구문 
			System.out.println("축하합니다."); // 조건문의 결과가 참인 경우만  실행
		} else { //if 조건문의 결과가 거짓인 경우
			System.out.println("다음 기회에."); //조건문의 결과가 거짓인 경우만  실행
		}
		//조건 연산자로 변경하기
		System.out.println((score>=60)?"축하합니다.":"다음 기회에.");
		//점수별로 A ~ F 학점 출력하기
		//조건문 {} 내부의 구문이 한개인 경우 {} 생략 가능
		if (score >= 90) {	System.out.println("A학점");
		  System.out.println("축하합니다.");
		}  
		 else if (score >= 80)	System.out.println("B학점");
		 else if (score >= 70)  System.out.println("C학점");
		 else if (score >= 60) 	System.out.println("D학점");
	//	 else      			    System.out.println("F학점");
		//조건 연산자로 변경하기
		System.out.println(((score>=90)?"A":(score>=80)?"B":(score>=70)?"C":
				(score>=60)?"D":"F")+"학점");
	}
}
