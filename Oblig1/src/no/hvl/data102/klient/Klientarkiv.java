package no.hvl.data102.klient;
import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.filmaktivADT;
public class Klientarkiv {
	
	public static void main(String[] args) { 
	  filmaktivADT filma = new Filmarkiv(100);  
		 Meny meny = new Meny(filma); 
		  meny.start(); 
//		  Film [] films = new Film [3];
//		  Tekstgrensesnitt tekstgr = new Tekstgrensesnitt();
//		  for (int i=0;i<films.length;i++) {
//			  films[i] = tekstgr.lesFilm();
//		  }
//		  for(int i=0; i<films.length;i++) {
//			  System.out.println(films[i].getGenreString()+"\n");
		  }
		  
} 
