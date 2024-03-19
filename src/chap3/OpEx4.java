package chap3;
/*
 * 관계(비교) 연산자 => 결과가 무조건 boolean(true,false)
 *   == : 등가
 *   >  : 크다
 *   ....
 * 논리연산자 
 *   &&(and) : 두값이 모두   true 인경우 만 true, 그외  false
 *             앞 구문이 false 인 경우 결과는 무조건 false => 뒷구문 실행 안함 
 *   ||(or)  : 두값이 모두   false 인경우 만 false, 그외  true
 *             앞 구문이 true 인 경우 결과는 무조건 true => 뒷구문 실행 안함
 */
public class OpEx4 {
	public static void main(String[] args) {
		int x=1,y=1;
		//관계연산자
		System.out.println(x+"=="+y+":"+(x==y)); //같다. true
		System.out.println(x+"!="+y+":"+(x!=y)); //같지않다  false
		System.out.println(x+">="+y+":"+(x>=y)); //크거나같다  true
		System.out.println(x+">"+y+":"+(x>y));   //크다      false
		System.out.println(x+"<="+y+":"+(x<=y)); //작거나같다  true
		System.out.println(x+"<"+y+":"+(x<y));   //작다       false
		//논리연산자
		System.out.println("x==1 && y==1 :" + (x==1 && y==1)); //T and T => T
		System.out.println("x==1 && y!=1 :" + (x==1 && y!=1)); //T and F => F
		System.out.println("x!=1 && y==1 :" + (x!=1 && y==1)); //F and T => F
		System.out.println("x!=1 && y!=1 :" + (x!=1 && y!=1)); //F and F => F
		System.out.println("x==1 || y==1 :" + (x==1 || y==1)); //T or T => T
		System.out.println("x==1 || y!=1 :" + (x==1 || y!=1)); //T or F => T
		System.out.println("x!=1 || y==1 :" + (x!=1 || y==1)); //F or T => T
		System.out.println("x!=1 || y!=1 :" + (x!=1 || y!=1)); //F or F => F
		//null : 값이 없음. 객체가 없다
		String str = null;
		if(str==null || str.equals("")) {
			System.out.println("str 변수에 값이 없음");
		}
		if( str.equals("")|| str==null) {
			System.out.println("str 변수에 값이 없음");
		}
	}

}
