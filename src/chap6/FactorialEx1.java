package chap6;
/*
 * 재귀함수 : Recursive call => 함수내에서 자신의 함수를 호출하는 함수
 */
public class FactorialEx1 {
	public static void main(String[] args) {
		System.out.println("4!=" + new FactorialEx1().factorial(4));
	}
	private  int factorial(int i) {
		return (i==1)?1:factorial(i-1)*i;
	}
}
