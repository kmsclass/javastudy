package test0328;

import java.util.Date;

/*
  회사가 고용하는 여러 유형의 직원들이 있다.
  직원은 정규직원과 비정규직원 으로 나뉜다.
  
  모든 직원은 직원구분(type), 이름(name), 주소(address),소속부서(dept)정보를 가진다.
  정규직원은 직원번호(empNo), 직급(position), 연봉(salary)를 가진다.
  비정규직원은 계약만료일(expireDate), 기본임금(primaryPay)를 가진다.
  
   직원클래스(Employee)
   정규직원 클래스(FormalEmployee)
   비정규직원클래스(InformalEmployee)

   또한 모든 직원은 급여를 받는다.
   정규직원은 급여로 연봉 / 12 로 
   비정규직원은 기본입금
   모든 클래스에 getPay() 메서드를 구현하기 
   
   구동클래스 실행시 다음의 결과가 나오도록 클래스 생성하기
    
[결과]
정규직:이름=김정규, 주소=서울시 용산구,부서=총무부,직원번호=1,직급=과장,연봉=5000
김정규의 급여 : 416
비정규직:이름=이비정, 주소=서울시 구로구,부서=영업부,계약만료일=Sun Sep 01 15:58:50 KST 2024,기본입금=1000
이비정의 급여 : 1000
*/
class Employee {
	String type,name,address,dept;
	Employee(String type, String name, String address, String dept) {
		this.type = type;
		this.name = name;
		this.address = address;
		this.dept =dept;
	}
	public String toString() {
		return type+":이름="+name+", 주소="+address + ",부서="+dept;
	}
	int getPay() {
		return 0;
	}; 
	
}
class FormalEmployee extends Employee {
	String empNo;
	String position;
	int salary;
	FormalEmployee (String name, String address, 
			String dept, String empNo,int salary,String position ) {
		super("정규직",name,address,dept);
		this.empNo = empNo;
		this.salary = salary;
		this.position = position;		
	}
	int getPay() {
		return salary/12;
	}
	public String toString() {
		return super.toString()+
				",직원번호="+empNo+",직급="+position+",연봉="+salary;
	}
}
class InformalEmployee extends Employee {
	Date expireDate;
	int primaryPay;
	//"이비정", "서울시 구로구", "영업부", expireDate, 1000
	InformalEmployee(String name, String address, String dept,
			Date expireDate,int primaryPay){
		super("비정규직",name,address,dept);
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	int getPay() {
		return primaryPay;
	}
	public String toString() {
		return super.toString()+
				",계약만료일="+expireDate+",기본입금="+primaryPay;
	}
}

public class Test1_A {
	public static void main(String[] args) {
		//정규직원 객체 생성
		  FormalEmployee fe = new FormalEmployee
				  ("김정규", "서울시 용산구","총무부", "1", 5000, "과장");
		  System.out.println(fe);
		  System.out.println(fe.name + "의 급여 : " +   fe.getPay());

		  //비정규직원 객체 생성
		  Date expireDate = new Date();
		  expireDate.setTime(expireDate.getTime() +1000L * 60 * 60 * 24 * 365 * 2);
		  InformalEmployee ie = new InformalEmployee
				  ("이비정", "서울시 구로구", "영업부", expireDate, 1000);
		  System.out.println(ie);
		  System.out.println(ie.name + "의 급여 : " +  ie.getPay());
	}
}
