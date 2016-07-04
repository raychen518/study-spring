package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.custom.case3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 * Custom qualifier annotations without required values can be created and used.
 * </pre>
 */
public class MovieRecommender {

	@Autowired(required = false)
	@MovieQualifier(genre = "Action", format = MovieFormat.VHS)
	private List<Movie> moviesOfActionAndVhs;

	@Autowired(required = false)
	@MovieQualifier(genre = "Comedy", format = MovieFormat.DVD)
	private List<Movie> moviesOfComedyAndDvd;

	@Autowired(required = false)
	@MovieQualifier(genre = "Science Fiction", format = MovieFormat.BLURAY)
	private List<Movie> moviesOfScienceFictionAndBluray;

	@Autowired(required = false)
	@MovieQualifier(genre = "War", format = MovieFormat.DVD)
	private List<Movie> moviesOfWarAndDvd;

	public void showRecommendedMovies() {
		System.out.println("Movies of Action and VHS");
		System.out.println("----------------------------------------------------");
		if (moviesOfActionAndVhs != null) {
			for (int i = 0; i < moviesOfActionAndVhs.size(); i++) {
				moviesOfActionAndVhs.get(i).showInfo();
				if (i != moviesOfActionAndVhs.size() - 1) {
					System.out.println();
				}
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println();

		System.out.println("Movies of Comedy and DVD");
		System.out.println("----------------------------------------------------");
		if (moviesOfComedyAndDvd != null) {
			for (int i = 0; i < moviesOfComedyAndDvd.size(); i++) {
				moviesOfComedyAndDvd.get(i).showInfo();
				if (i != moviesOfComedyAndDvd.size() - 1) {
					System.out.println();
				}
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println();

		System.out.println("Movies of Science Fiction and Blu-ray");
		System.out.println("----------------------------------------------------");
		if (moviesOfScienceFictionAndBluray != null) {
			for (int i = 0; i < moviesOfScienceFictionAndBluray.size(); i++) {
				moviesOfScienceFictionAndBluray.get(i).showInfo();
				if (i != moviesOfScienceFictionAndBluray.size() - 1) {
					System.out.println();
				}
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println();

		System.out.println("Movies of War and DVD");
		System.out.println("----------------------------------------------------");
		if (moviesOfWarAndDvd != null) {
			for (int i = 0; i < moviesOfWarAndDvd.size(); i++) {
				moviesOfWarAndDvd.get(i).showInfo();
				if (i != moviesOfWarAndDvd.size() - 1) {
					System.out.println();
				}
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println();
	}

	public static void main(String[] args) {
		MovieRecommender movieRecommender = new MovieRecommender();
		movieRecommender.showRecommendedMovies();
	}

}
