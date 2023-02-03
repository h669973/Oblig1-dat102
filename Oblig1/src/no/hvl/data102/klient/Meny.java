package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.adt.filmaktivADT;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private filmaktivADT filmarkiv;

	public Meny(filmaktivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}

	public void start() {
		// legg inn en del forhåndsdefinerte filmer for å teste metodene
		new Film(0, "Peter", "Hobbit", 2015, "WarnerBros", "action");
		new Film(1, "Kamil", "Lord of the rings", 2002, "Disney", "Scifi");
		new Film(2, "Eirik", "Harry Potter", 2003, "20th Century", "Action");
		new Film(3, "Alina", "On Time", 2016, "20th Century", "Drama");
		new Film(4, "Marius", "WW2", 1999, "WarnerBros", "History");
		
		tekstgr.visFilm(null);

	}
	
}