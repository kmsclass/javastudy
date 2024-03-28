package chap7;
/*
 * instanceof 연산자 : 단항연산자
 *  => 객체와 참조변수의 관계리턴
 *  
 * 부모클래스의 객체를 자손클래스타입의 참조변수로 참조 불가 : ClassCastException 예외발생
 *  
 */
public class InstanceOfEx1 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
//		Child2 c = (Child2)p;
//		System.out.println(p.x);
//		System.out.println(c.x);
		if (p instanceof Child2) {
			System.out.println("p 참조변수가 참조하는 객체는 Child2 객체임");
			Child2 c = (Child2)p;
		}
		if (p instanceof Parent2) {
			System.out.println("p 참조변수가 참조하는 객체는 Parent2 객체임");
			Parent2 p2 = p;
		}
		if (p instanceof Object) {
			System.out.println("p 참조변수가 참조하는 객체는 Object 객체임");
			Object o = p;
		}
	}
}
