package no.hvl.data102;

import no.hvl.dat102.kjedet.LinearNode;
import no.hvl.data102.Sjanger.Sjangers;
import no.hvl.data102.adt.filmaktivADT;

public class Filmarkiv2<Film> implements filmaktivADT {
	private int antall; 
    private LinearNode<Film> start; 
    // Ingen referanse til siste, kun start 
    private static final int STDK = 100;
	public Filmarkiv2() {
		this(STDK);
	}

	public Filmarkiv2(int start) {
		antall = 0;
		
		LinearNode<Film> nynode = new LinearNode<Film>(start);
	}

	/**
	 * @return the antall
	 */
	public int getAntall() {
		return antall;
	}

	/**
	 * @return returnerer tabellen
	 */
	public Film[] getFilm() {
		return film;
	}


	/**
	 * @param bag the bag to set
	 */
	public void setFilm(Film[] film) {
		this.film = film;
	}

	
	

	private void utvidKapasitet() {
		Film[] hjelpebag = (Film[]) (new Object[2 * film.length]);
		for (int i = 0; i < film.length; i++) {
			hjelpebag[i] = film[i];
		}
		film = hjelpebag;
	}
	
	private Film[] trimTab(Film[] tab, int n) {
		
		  Film[] nytab = new Film[n]; 
		  int i = 0; 
		  while (i < n) { 
		   nytab[i] = tab[i]; 
		   i++; 
		  } 
		  return nytab; 
		 } 

	
	public void nullstill() {
		for (int i = 0; i < antall; i++) {
			film[i] = null;
		}
		antall = 0;
	}

	@Override
	public int antall() {
		return antall;
	}

	

	public void skriv() {
		for (int i = 0; i < antall; i++) {
			System.out.println(film[i]);

		}
	}

	@Override
	public Film finnFilm(int nr) {
		for (int i = 0; i < antall; i++) {
			if (film[i].equals(nr)) {
				return film[i];
			}
		}
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (antall == film.length) {
			utvidKapasitet();
		}
		film[antall] = nyFilm;
		antall++;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		boolean funnet = false;
		 

		for (int i = 0; (i < antall && !funnet); i++) {
			if (film[i].equals(filmnr)) {
				film[i] = film[antall - 1];
				film[antall - 1] = null;
				antall--;
				funnet = true;
			}
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] nyfilm = (Film[]) new Object[antall];
		for(int i=0;i<antall;i++) {
			if(film[i].getFilmTitle().equals(delstreng)) {
				nyfilm[i] = film[i];
			}
				
			}
		
		return nyfilm;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] nyfilm = (Film[]) new Object[antall];
		for(int i=0;i<antall;i++) {
			if(film[i].getProducer().equals(delstreng)) {
				nyfilm[i] = film[i];
			}
				
			}
		
		return nyfilm;
		
	}

	@Override
	public int antall(Sjangers sjanger) {
		int newantall = 0;
		
		String s =""+ sjanger;
		for (Sjangers sj : Sjangers.values()) {
			if (sj.toString().equals(s.toUpperCase())) {
				
				newantall++;
			}
			
		
		}
		return newantall;
	}
}
