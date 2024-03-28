package chap7;
/*
 * super 예약어
 * super() 생성자: 
 *     자손클래스에서 부모 클래스의 생성자 호출시 사용
 *     자손클래스의 생성자 첫줄에 구현해야 함
 *     부모 클래스의 생성자 중 매개변수가 없는 생성자가 있다면 생략 가능 : super()
 *     부모 클래스의 생성자 중 매개변수가 없는 생성자가 없다면 생략 불가 : super(....)
 * super 참조변수 :
 *     부모클래스의 객체를 참조하는 참조변수
 *     인스턴스 메서드에서만 사용가능함
 */
class Parent {
	int x = 10;
	Parent(int x) {
		System.out.println("Parent 클래스의 생성자");
		this.x = x;
	}
	Parent(){
		System.out.println("Parent 클래스의 생성자");
	}
}
class Child extends Parent {
	int x = 20;
	Child() {
		super(100);
		System.out.println("Child 클래스의 생성자");
	}
	void method() {
		int x = 30;
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
public class SuperEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
		c.method();
	}
}
