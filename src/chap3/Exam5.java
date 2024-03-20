package chap3;
/*
 * 결과가 나오도록 프로그램 수정하기
 */
public class Exam5 {
	public static void main(String[] args) {
		byte a =10;
		byte b =20;
		byte c = (byte) (a + b);
		char ch = 'A';
//		ch = (char)(ch + 2);
		ch += 2;
		float f = 3f/2;
		long l = 3000L * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1f;
		boolean result = d == f2;
		System.out.println("c=" + c);  //c=30
		System.out.println("ch=" + ch); //ch=C
		System.out.println("f=" + f);   //f=1.5 
		System.out.println("l=" + l);   //27000000000
		System.out.println("result=" + result); //true
		System.out.printf("%.20f\n",0.1f);
		System.out.printf("%.20f\n",0.1);
	}
}
