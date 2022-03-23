package fr.fms.entities;

public class TestCommercial {

	/**
	 * Program principal test de nos commerciaux.
	 * @param args
	 * @author Jean-Charles Duffau
	 * @version 1.0
	 */
	public static void main(String[] args) {
		
		Commercial marcel = new Commercial("Marcel","Poirot", 40,"15 ème arrondissement de Paris",new City("Marseille","France",845000),"Total",812500.50); 
		Commercial anthony = new  Commercial("Anthony", "Queen", 25,"White Street London",new Capital("Tokyo","Japan",645000,"Mont Fuji"),"BBC",6010500.50); 
		Commercial bob = new  Commercial("Bob", "Lee-pong", 52,"Quartier des Minimes Toulouse",new Capital("Tououse","Occitanie",245000,"Capitole"),"FMS",1212500.50); 
		
		System.out.println(marcel); 
		System.out.println(anthony);
		System.out.println(bob);


	}

}
