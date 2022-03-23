package fr.fms.entities;

public class TestCapital {

	/**
	 * Exercice sur la Poo.
	 * Héritage de classe.
	 *
	 * @author Jean-Charles Duffau
	 * @version 1.0
	 * 
	 * 
	 */
	public static void main(String[] args) {

	

		Capital paris = new Capital("Paris","France", 8470000,"Tour Eiffel"); 
		Capital london = new  Capital("London", "Great-Britain", 2750000,"BigBen"); 
		Capital toulouse = new  Capital("Toulouse", "Occitanie", 750000,"Capitole"); 
		
		System.out.println(paris); 
		System.out.println(london);
		System.out.println(toulouse);


	}

}
