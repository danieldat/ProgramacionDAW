package Coche;

import Coche.Coche;

public class PruebaCoche {
	  public static void main(String[] args) {
	    
	    Coche cocheDeLuis = new Coche("Saab", "93", 0);
	    Coche cocheDeJuan = new Coche("Toyota", "Avensis", 0);

	    cocheDeLuis.recorre(30);
	    cocheDeLuis.recorre(40);
	    cocheDeLuis.recorre(220);
	    cocheDeJuan.recorre(60);
	    cocheDeJuan.recorre(150);
	    cocheDeJuan.recorre(90);
	    System.out.println("El coche de Luis ha recorrido " + cocheDeLuis.getKilometraje() + "Km");
	    System.out.println("El coche de Juan ha recorrido " + cocheDeJuan.getKilometraje() + "Km");
	  }
}