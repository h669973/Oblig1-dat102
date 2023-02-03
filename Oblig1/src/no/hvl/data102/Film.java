package no.hvl.data102;

public class Film {
	int filmnr;
	String producer;
	String FilmTitle;
	int launchYear;
	String FilmComp;
	Sjanger genre;

	public Film() {
		this(0, "", "", 0, "", "" );
	}

	public Film(int filmnr, String producer, String FilmTitle, int launchYear, String FilmComp, String genreString) {
		this.filmnr = filmnr;
		this.producer = producer;
		this.FilmTitle = FilmTitle;
		this.launchYear = launchYear;
		this.FilmComp = FilmComp;
		this.genre = Sjanger.finnSjanger(genreString);
		
	}

	public int getFilmnr() {
		return filmnr;
	}

	public String getProducer() {
		return producer;
	}

	public String getFilmTitle() {
		return FilmTitle;
	}

	public int getLaunchYear() {
		return launchYear;
	}

	public String getFilmComp() {
		return FilmComp;
	}
public Sjanger getGenreString() {
	return genre;
}
	

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setFilmTitle(String FilmTitle) {
		this.FilmTitle = FilmTitle;
	}

	public void setLaunchYear(int launchYear) {
		this.launchYear = launchYear;
	}

	public void setFilmComp(String FilmComp) {
		this.FilmComp = FilmComp;
	}
	public void setGenreString(String genreString) {
		this.genre = Sjanger.finnSjanger(genreString);
	}


	@Override
	public boolean equals(Object andre) {
		if (this == andre) {
			return true;
		}
		if (andre == null) {
			return false;

		}
		if (getClass() != andre.getClass()) {
			return false;
		}
		Film denAndre = (Film) andre;
		boolean like = this.filmnr == denAndre.getFilmnr() && this.producer == denAndre.getProducer()
				&& this.FilmTitle == denAndre.getFilmTitle() && this.launchYear == denAndre.getLaunchYear()
				&& this.FilmComp == denAndre.getFilmComp() && this.genre == denAndre.getGenreString();

		return like;
	}

	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}
	public String toString() {
		return filmnr + " " + producer + " " + FilmTitle + " " + launchYear + " " +FilmComp + " "+genre;}
}