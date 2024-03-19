package chap3;
/*
 * 이항 연산자 : 산술연산자
 *   +,-,*,/
 *   % : 나머지  => 나머지 결과의 부호는 피젯수의 부호를 따른다
 *    
 */
public class OpEx3 {
	public static void main(String[] args) {
		int x=10,y=8;
		double d = x/y;
		System.out.println(d); //
		System.out.println("10.0/8="+(10.0/8)); //1.25
		System.out.println("10/8="+(10/8)); //1
		System.out.println("-10/8="+(-10/8));//-1
		System.out.println("10/-8="+(10/-8)); //-1
		System.out.println("-10/-8="+(-10/-8)); //1
		System.out.println("10%8="+(10%8));  //2
		System.out.println("-10%8="+(-10%8));//-2
		System.out.println("10%-8="+(10%-8));//2
		System.out.println("-10%-8="+(-10%-8));//-2
	}
}
