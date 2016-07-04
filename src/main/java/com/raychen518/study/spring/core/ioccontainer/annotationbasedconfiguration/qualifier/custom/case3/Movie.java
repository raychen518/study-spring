package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.custom.case3;

public class Movie {

	private String name;
	private String genre;
	private MovieFormat format;
	private int length;

	public Movie() {
	}

	public Movie(String name, String genre, MovieFormat format, int length) {
		this.name = name;
		this.genre = genre;
		this.format = format;
		this.length = length;
	}

	public void showInfo() {
		System.out.println("Name\t: " + name);
		System.out.println("Genre\t: " + genre);
		System.out.println("Format\t: " + format);
		System.out.println("Length\t: " + length);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setFormat(MovieFormat format) {
		this.format = format;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public static void main(String[] args) {
		{
			Movie movie = new Movie("Deadpool", "Action", MovieFormat.VHS, 108);
			movie.showInfo();
			System.out.println();
		}

		{
			Movie movie = new Movie("The Wolf of Wall Street", "Comedy", MovieFormat.DVD, 127);
			movie.showInfo();
			System.out.println();
		}

		{
			Movie movie = new Movie("X-Men: Apocalypse", "Science Fiction", MovieFormat.BLURAY, 96);
			movie.showInfo();
			System.out.println();
		}

		{
			Movie movie = new Movie("John Wick", "Action", MovieFormat.VHS, 181);
			movie.showInfo();
			System.out.println();
		}

		{
			Movie movie = new Movie("Kung Fu Panda", "Comedy", MovieFormat.DVD, 138);
			movie.showInfo();
			System.out.println();
		}
	}

}
