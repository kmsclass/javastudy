package chap6;
/*
 * 오버로딩 메서드의 선택 기준
 * 1. 호출시 입력된 인자값의 자료형과 메서드에 선언된 매개변수의 자료형이 동일한 경우
 * 2. 1의 조건이 없는 경우
 *     최소 갯수로 자동 형변환이 가능한 메서드 선택
 *     => 동일한 조건의 메서드가 여러개인 경우 오류 발생. : 메서드 추가. 중복조건 제거
 */
class Math3 {
	int add(int a, int b) {
		System.out.print("1:");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("2:");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("3:");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("4:");
		return a+b;
	}
}
public class OverloadingEx2 {
	public static void main(String[] args) {
		Math3 m = new Math3();
		System.out.println(m.add(10, 20));
		System.out.println(m.add(10L, 20));
		System.out.println(m.add(10, 20L));
		System.out.println(m.add(10L, 20L));
	}
}
