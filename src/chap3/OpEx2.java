package chap3;
/*
 * 단항 연산자
 *  - 논리부정연산자 : !
 *  - 부호 연산자 : +,-
 *    + : 현재 피연산자의 부호를 유지. 양수인 경우 양수, 음수인 경우 음수
 *    - : 현재 피연산자의 부호를 변경. 양수인 경우 음수, 음수인 경우 양수
 *  - 형변환 연산자 
 *    (자료형)피연산자  
 */
public class OpEx2 {
	public static void main(String[] args) {
		System.out.println("true=" + !false);
		System.out.println("false=" + !true);
		System.out.println("!(3>5):"+!(3>5)); //true
		//부호 연산자
		int x = -10;
		System.out.println("+x=" + +x);
		System.out.println("-x=" + -x);
		x = +10;
		System.out.println("+x=" + +x);
		System.out.println("-x=" + -x);
	}
}
