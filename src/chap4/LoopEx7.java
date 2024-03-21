package chap4;
/*
 * 1에서 100까지의 합을 실행 할때 합이 처음으로 1000을 넘는 숫자와 합을 출력하기
 */
public class LoopEx7 {
	public static void main(String[] args) {
		int sum=0,i=0;
		for(i=1;i<=100;i++) {
			sum += i;
			if(sum > 1000) break;
		}
		System.out.println(i + ":"+sum);
		sum = 0;
		for(i=1;i<=45;i++) {
			sum += i;
		}
		System.out.println(sum);
		sum=0;
		i=0;
		while(sum < 1000) {
			i++;
			sum += i; //1+2+3...44
		}
		System.out.println(i + ":"+sum);
		sum=0;
		i=0;
		while(true) {
			i++;
			sum += i; //1+2+3...44
			if (sum > 1000) break;
		}
		System.out.println(i + ":"+sum);
	}
}
