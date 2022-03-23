package fr.fms.entities;

public class TestEmploye {
	
	
/**
 * Program principal test de nos employés.
 * @param args
 * @author Jean-Charles Duffau
 * @version 1.0
 */
	public static void main(String[] args) {
		
		Employe marcel = new Employe("Marcel","Poirot", 40,"15 ème arrondissement de Paris",new City("Marseille","France",845000),"Total",12500.50); 
		Employe anthony = new  Employe("Anthony", "Queen", 25,"White Street London",new Capital("Tokyo","Japan",645000,"Mont Fuji"),"BBC",10500.50); 
		Employe bob = new  Employe("Bob", "Lee-pong", 52,"Quartier des Minimes Toulouse",new Capital("Tououse","Occitanie",245000,"Capitole"),"FMS",1212500.50); 
		
		System.out.println(marcel); 
		System.out.println(anthony);
		System.out.println(bob);

		
		
		
		
	}

}
