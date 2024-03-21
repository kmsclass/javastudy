package chap4;
/*
 * 중첩반복문 : 반복문 내부에 반복문이 존재
 */
public class LoopEx4 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {  //i=4
			System.out.println("\n"+i+"단");
			for(int j=2;j<=9;j++) { //j=10
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
