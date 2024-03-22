package chap5;

/*
 * Command 라인에서 숫자들을 입력받아 숫자들의 자리수의 합 출력하기
 * java Exam4 123 456 789
 * [결과]
 * 123 456 789 의 자리수 합 : 45  
 */
public class Exam4 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command 라인에 숫자를 입력하세요");
			return;
		}
		int sum = 0; //모든 숫자의 합
		//args : 123 456 789
		//args[0] : 123
		//args[1] : 456
		//args[2] : 789
		for (int i=0;i< args.length;i++) {
			System.out.print(args[i] + " "); //789
			for (int j = 0; j < args[i].length(); j++) {
				sum += args[i].charAt(j) - '0'; // 순수 숫자값 합계
			}
		}
		System.out.println("의 자리수 합: "+sum);
		sum = 0;
		for (int i=0;i< args.length;i++) {
			for (int j = 0; j < args[i].length(); j++) {
				sum += args[i].charAt(j) - '0'; // 순수 숫자값 합계
				System.out.print(args[i].charAt(j) 
				+ ((i==args.length-1 && j==args[i].length()-1)?"=":"+"));
			}
		}
		System.out.println(sum);
	}
}
