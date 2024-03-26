package chap6;
class Car2 {
	String color;  //객체화시 변수가 됨=>인스턴스변수
	int num;       //인스턴스변수
	int sno;       //인스턴스변수
    static int cnt;  //클래스정보 로드시 변수가 됨 =>클래스변수
    //객체를 문자열화 하는 메서드 
    public String toString() {
    	return "자동차번호:"+sno +"=>" +color + "," + num + ",자동차생산갯수:"+cnt;
    }
}
public class StaticValEx1 {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); //main메서드 내부에서만 사용이 가능함 변수 => 지역변수 
		c1.color = "White";		c1.num = 1234;
		c1.sno = ++Car2.cnt;
		System.out.println(c1); //참조변수를 출력시 toString()메서드 호출함
		Car2 c2 = new Car2();
		c2.color = "Black";		c2.num = 5678;
		c2.sno = ++Car2.cnt;
		System.out.println(c1);
		System.out.println(c2);
		//int i=0;
    	for(int i=0;i<10;i++) { //for 내부에서만 사용이 가능한 변수 => 지역변수
    		System.out.println(i);
    	}
//    	System.out.println(i);
	}
}
