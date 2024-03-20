package chap3;

public class OpEx7 {
	public static void main(String[] args) {
		//printf : format을 지정하여 출력가능함
		//%d : 10진 정수 형태로 출력
		int num = 100;
		System.out.printf("%d,%d\n",num,12345);
		//%10d : 10진 정수를 최소 10자리로 출력
		System.out.printf("%10d,%10d\n",num,12345);
		//%10d : 10진 정수를 최소 10자리로 왼쪽 정렬 출력
		System.out.printf("%-10d,%-10d\n",num,12345);
		//%10d : 10진 정수를 최소 10자리로 왼쪽 정렬로 ,도 출력
		System.out.printf("%-,10d,%-,10d\n",num,12345);
		//%10d : 10진 정수를 최소 10자리로 하고, 빈자리는 0으로 채워 출력
		System.out.printf("%010d,%010d\n",num,12345);
		//%f :  실수(부동소숫점) 형태로 출력
		System.out.printf("%d,%f\n",num,12345.145);
		//10자리를 확보하고, 소숫점이하 2자리로 출력하기
		System.out.printf("%10.2f\n",12345.145);
		//소숫점이하 2자리로 출력하기
		System.out.printf("%.2f\n",12345.145);
		//10자리를 확보하고, 소숫점이하 2자리로 세자리마다 , 출력하기
		System.out.printf("%,10.2f\n",12345.145);
		//10자리를 확보하고, 소숫점이하 2자리로 세자리마다 , 왼쪽 정렬 출력하기
		System.out.printf("%-,10.2f\n",12345.145);
	}
}
