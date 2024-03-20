package chap4;
/*
 * 1~100까지의 짝수의 합 출력하기
 * for
 * while
 * do while
 */
public class Exam4 {
	public static void main(String[] args) {
		int sum=0,i=0;
		System.out.println("for 구문");
	    for (i=1;i<=100;i++) {
	    	if(i%2==0) 	sum += i;
	    }
	    System.out.println("합계:"+sum);
	    sum = 0;
	    for (i=2;i<=100;i+=2) {
	    	sum += i;
	    }
	    System.out.println("합계:"+sum);
		System.out.println("while 구문");
	    sum = 0;
	    i = 1;
	    while(i<=100) {
	    	if(i%2==0) sum += i;
	    	i++;
	    }
	    System.out.println("합계:"+sum);
	    sum = 0;
	    i = 2;
	    while(i<=100) {
	    	sum += i;
	    	i+=2;
	    }
	    System.out.println("합계:"+sum);
		System.out.println("do while 구문");
	    sum = 0;
	    i = 1;
	    do{
	    	if(i%2==0) sum += i;
	    	i++;
	    }while(i<=100);
	    System.out.println("합계:"+sum);
	    sum = 0;
	    i = 2;
	    do{
	    	sum += i;
	    	i+=2;
	    }while(i<=100);
	    System.out.println("합계:"+sum);	    
	}
}
