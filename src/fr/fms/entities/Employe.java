package fr.fms.entities;

public class Employe extends Person {
	
	private String enterprise;
	private double salary;
	private int charge=100;

	public Employe(String firstName, String lastName, int age, String adress,Object bornCity,String enterprise,double salary) {
		super(firstName, lastName, age, adress, bornCity);
		setEnterprise(enterprise);
		setSalary(salary);
	}
	
	//accessors

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double remuneration() {
		salary=salary-charge;
		return salary;
		
	}

	@Override
	public String toString() {
		return super.toString()+ ", Entreprise : " + enterprise + ", salaire : " + remuneration();
	}

	
	
}
