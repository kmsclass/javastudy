package test0322;
/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
     java Test8 10 20

   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class Test8_A {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("command line에 두개의 파라미터만 입력하세요");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int min = (num1>num2)?num2:num1;
		System.out.print(num1 + "과" +  num2+"의 공약수 : ");
		for(int i=1;i<=min;i++) {
			if(num1%i==0 && num2%i==0 ) {
				System.out.print(i + ",");
			}
		}
		System.out.println();
	}
}
