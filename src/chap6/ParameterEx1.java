package chap6;
/*
 * 매개변수 예제
 *   기본형매개변수 : 호출된(change1) 메서드에서 호출한(main) 메서드의 변수값 변경 불가
 *   참조형매개변수 : 호출된(change2) 메서드에서 호출한(main) 메서드의 변수값 변경 가능
 */
class Value {
	int val;
}
public class ParameterEx1 {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("change1 함수 호출후:"+v.val);
		change2(v);
		System.out.println("change2 함수 호출후:"+v.val);
	}
	private static void change1(int val) {
		val += 100;
		System.out.println("change1 함수 내부 :" + val);
	}
	private static void change2(Value v) {
		v.val += 100;
		System.out.println("change2 함수 내부 :" + v.val);
	}
}
