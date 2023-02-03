package no.hvl.data102.klient;


import java.util.Scanner;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.Sjanger;

public class Tekstgrensesnitt {
	// lese opplysningene om en FILM fra tastatur  
	 public Film lesFilm(){ 
	  //TODO
		 
		        
		        Film film = new Film();
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Film nr: ");
		        while (true) {
		            String next = scanner.next();
		            try {
		                film.setFilmnr(Integer.parseInt(next));
		                break;
		            } catch (NumberFormatException e) {
		                System.out.println("You must enter a number! Please try again.\nFilm nr: ");
		            }
		        }
		        
		        System.out.println("Producer's name: ");
		        film.setProducer(scanner.next());
		        
		       
		        
		        System.out.println("Film Title: ");
		        film.setFilmTitle(scanner.next());

		        
		        

		        System.out.println("Film launch year: ");
		        while (true) {
		            String next = scanner.next();
		            try {
		                film.setLaunchYear(Integer.parseInt(next));
		                break;
		            } catch (NumberFormatException e) {
		                System.out.println("You must enter a number! Please try again.\nFilm launch year: ");
		            }
		        }
		      
		        
		        System.out.println("Film Company: ");
		        film.setFilmComp(scanner.next());
		        
		        
		        System.out.println("Genre: ");
		        film.setGenreString(scanner.next()); 
		        
		        return film;
	  
	 }
	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		System.out.println(film + "");
	}

	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(Filmarkiv filma, String delstreng) {
		// TODO
while(true) {
	System.out.println(filma.soekTittel(delstreng));
}
	}

	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(Filmarkiv filma, String delstreng) {
		// TODO Denne gjør tilsvarende som metoden over
		while(true) {
			System.out.println(filma.soekProdusent(delstreng)+"");
		}
	}

	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(Filmarkiv filma) {
		// TODO
while(true) {
	System.out.println(filma.antall() +"");
}
	}
	
	// ... Ev. andre metoder
}
