package prob04;

public class Depart extends Employee {
	String depart;
	
	Depart(String name, int salary, String dep){
		super.setName(name);
		super.setSalary(salary);
		this.depart = dep;
	}
	
	public void getInformation() {
		System.out.println("이름: " + super.getName() + " 연봉: " + super.getSalary() + " 부서: " + this.depart);
	}
}