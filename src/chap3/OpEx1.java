package chap3;
/*
 * 단항연산자 : 연산자의 피연산자가 한개인 경우
 *  1. 증감연산자 : ++,--
 *     ++ : 변수값을 1 증가
 *     -- : 변수값을 1 감소
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x=5,y=5;
		x++;  //x의 값을 1증가. x:6
		y--;  //y의 값을 1감소. y:4
		System.out.println("x="+x + ",y="+y);
		++x;  //x의 값을 1증가. x:7
		--y;  //y의 값을 1감소. y:3
		System.out.println("x="+x + ",y="+y);
		x=y=5; //x,y 값을5로 초기화
		y = ++x;  //1. x의 값을 1증가, 2. y값 대입.  x:6, y:6
		System.out.println("x="+x + ",y="+y);
		x=y=5; //x,y 값을5로 초기화
		y = x++; //1. x의 값을 y에 대입, 2.x의 값을 1증 x:6, y=5
		System.out.println("x="+x + ",y="+y);
		y = ++x; //1. x의 값을 1증가, 2. y값 대입.  x:7, y:7
		System.out.println("x="+x + ",y="+y);
		x=y=5;
		System.out.println("x="+ x++); //x=5
		System.out.println("x="+x);    //x=6
		System.out.println("x="+ ++x); //x=7 
		System.out.println("y="+ y--); //y=5
		System.out.println("y="+y);    //y=4
		System.out.println("y="+ --y); //y=3 
	}
}
