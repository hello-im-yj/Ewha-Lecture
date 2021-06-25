
/* 1748022 김유진
 * (실습1) Employee 클래스 구현
 * */


package Pm1;

public class Employee {
	
	private String id;
	private String name;
	private int workHours;
	private int overTimeHours;
	private PayManager payManaget;
	
	
	
	
	public Employee(String id, String name, int workHours, int overTimeHours) {
		super();
		this.id = id;
		this.name = name;
		this.workHours = workHours;
		this.overTimeHours = overTimeHours;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getWorkHours() {
		return workHours;
	}

	public int getOverTimeHours() {
		return overTimeHours;
	}

	public PayManager getPayManaget() {
		return payManaget;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public void setOverTimeHours(int overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	public void setPayManaget(PayManager payManaget) {
		this.payManaget = payManaget;
	}

	public long calculatePay() {
		long pay = payManaget.calculatePay(this);
		return pay;
	}

}
