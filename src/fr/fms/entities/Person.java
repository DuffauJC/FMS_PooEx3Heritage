package fr.fms.entities;


public class Person {

	// properties
	private String firstName;
	private String lastName;
	private int age;
	private String adress;
	private Object bornCity;

/**
 * constructor
 * @param firstName
 * @param lastName
 * @param age
 * @param adress
 */
	public Person(String firstName, String lastName, int age, String adress,Object bornCity) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAdress(adress);
		setBornCity(bornCity);
	}



	// accessors
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Object getBornCity() {
		return bornCity;
	}



	public void setBornCity(Object bornCity) {
		this.bornCity = bornCity;
	}

	// methodes

	/**
	 * methode toString
	 */
	@Override
	public String toString() {

		return getLastName() + " , " + getFirstName() +
				" , " +getAge()+"ans" + " , habitant "+getAdress()+" , " +getBornCity();

	}





}
