package fr.fms.entities;

public class Commercial extends Person {

	private String enterprise;
	private double ca=10.0;
	private double salary=10.0;
	
/**
 * constructor
 * @param firstName
 * @param lastName
 * @param age
 * @param adress
 * @param bornCity
 * @param enterprise
 * @param ca
 */
	public Commercial(String firstName, String lastName, int age, String adress, Object bornCity,String enterprise,double ca) {
		super(firstName, lastName, age, adress, bornCity);
		setEnterprise(enterprise);
		setCa(ca);
	}
	
	/**
	 * surcharge du constructor
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param adress
	 * @param bornCity
	 * @param enterprise
	 */
	public Commercial(String firstName, String lastName, int age, String adress, Object bornCity,String enterprise) {
		super(firstName, lastName, age, adress, bornCity);
		setEnterprise(enterprise);
		setCa(ca);
	}


	//accessors
	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public double getCa() {
		return ca;
	}

	public void setCa(double ca) {
		if (ca <0) {
			throw new RuntimeException("Le % du CA ne peut être négatif.");
		}
		this.ca = ca;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calcul(double ca) {
		salary=ca*0.20;
		return salary;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Entreprise : "  + enterprise + ", rémunération 20 % de " + ca + " soit : " + calcul(ca) +"Euros";


	}



}
