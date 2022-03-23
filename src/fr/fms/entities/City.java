package fr.fms.entities;

public class City {

	// properties
	private String cityName;
	private String country;
	private int nbInhabitants;


	/**
	 * constructor
	 * @param cityName
	 * @param country
	 * @param nbInhabitants
	 */
	public City(String cityName, String country, int nbInhabitants) {

		setCityName(cityName);
		setCountry(country);
		setNbInhabitants(nbInhabitants);

	}

	// accessors
	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getNbInhabitants() {
		return nbInhabitants;
	}


	public void setNbInhabitants(int nbInhabitants) {
		if (nbInhabitants <0) {
			throw new RuntimeException("Le nombre d'habitants ne peut être négatif.");
		}
		this.nbInhabitants = nbInhabitants;
	}


	// methodes

	/**
	 * 
	 * methode toString
	 */
	@Override
	public String toString() {
		if (getNbInhabitants()==0) {
			return "Ville de naissance : "+ getCityName() + " , " + getCountry();
		}else {
			return "Ville de naissance : "+getCityName() + " , " + getCountry() +
					" , " + getNbInhabitants()+" habitants ";	
		}

	}


}
