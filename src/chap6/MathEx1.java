package chap6;
/*
 * 멤버 메서드(멤버함수,Function)
 * [접근제어자][제어자]리턴타입 메서드명(매개변수목록) => 선언부
 * {.....}                                  => 구현부
 * 
 *  리턴타입 : 메서드 종료후 전달되는 값의 자료형
 *           void 인 경우는 전달 값이 없음.
 *  매개변수 : 메서드 호출시 메서드에 전달되는 값의 자료형 설정
 *           (자료형1 변수명1,자료형2 변수명2,....)  
 *  return 예약어 : 메서드 종료
 *      리턴타입 void          : return 생략 가능. 메서드의 끝을 만나면 메서드 종료
 *      리턴타입이 void 아닌 경우 : return 생략 불가.
 *                              return 리턴값;
 *                          리턴값은 리턴타입과 같거나, 리턴타입으로 자동형변환이 되어야 한다                
 */
class Math1 {
	int add1(int a, int b) {
		return a+b;  //a+b 자료형:int, 리턴타입:int
	}
	long add2(int a, int b) {
		return a+b;  //a+b 자료형:int, 리턴타입:long => 자동형변환
	}
	void add3(long a, int b) { //리턴타입:void => 리턴값이 없음
		System.out.println(a+b);
		return;  //메서드 종료. 생략 가능. 메서드 } 실행되면 메서드 종료됨
	}
}
public class MathEx1 {
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10,20);
		System.out.println("add1(10,20):"+a1);
		long a2 = m1.add2(10,20);
		System.out.println("add2(10,20):"+a2);
		System.out.print("add3(10,20):");
		m1.add3(10,20);
//		System.out.println("add3(10,20):"+a3);
	}

}
