package fr.fms.entities;

import java.util.ArrayList;

public class TestEntities {

	public static void main(String[] args) {
		
		Employe marcel = new Employe("Marcel","Poirot", 40,"15 ème arrondissement de Paris",new City("Marseille","France",845000),"Total",12500.50); 
		Employe anthony = new  Employe("Anthony", "Queen", 25,"White Street London",new Capital("Tokyo","Japan",645000,"Mont Fuji"),"BBC",10500.50); 
		Employe bob = new  Employe("Bob", "Lee-pong", 52,"Quartier des Minimes Toulouse",new Capital("Tououse","Occitanie",245000,"Capitole"),"FMS",1212500.50); 
		
		Commercial jhon = new Commercial("Jhon","Poirot", 40,"15 ème arrondissement de Paris",new City("Marseille","France",845000),"Total"); 
		Commercial luke = new  Commercial("Luke", "Queen", 25,"White Street London",new Capital("Tokyo","Japan",645000,"Mont Fuji"),"BBC",6010500.50); 
		Commercial boby = new  Commercial("Boby", "Lee-pong", 52,"Quartier des Minimes Toulouse",new Capital("Tououse","Occitanie",245000,"Capitole"),"FMS",1212500.50); 
		
		//ajout des entités dans la liste
		ArrayList<Object>entities=new ArrayList<>();
		entities.add(marcel);
		entities.add(anthony);
		entities.add(bob);
		entities.add(jhon);
		entities.add(luke);
		entities.add(boby);
		
		for (Object person : entities) {
			System.out.println(person.toString());
		}
		
		/*
		 * entities.forEach(ent->{ ent.toString(); });
		 */
	}

}
