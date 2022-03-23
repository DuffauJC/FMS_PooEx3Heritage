package fr.fms.entities;

public class Capital extends City {

	private String monument;

	/**
	 * 
	 * @param cityName
	 * @param country
	 * @param nbInhabitants
	 */
	public Capital(String cityName, String country, int nbInhabitants,String monument) {
		super(cityName, country, nbInhabitants);

		setMonument(monument);
	}


	/**
	 * 
	 * @return 
	 */
	public String getMonument() {
		return monument;
	}
	/**
	 * 
	 * @param monument
	 */
	public void setMonument(String monument) {
		this.monument = monument;
	}


	@Override
	public String toString() {
		return super.toString() +"monument : " + monument;
	}








}
