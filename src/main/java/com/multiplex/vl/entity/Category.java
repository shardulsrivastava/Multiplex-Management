/**
 * 
 */
package com.multiplex.vl.entity;

/**
 * @author SHARDUL
 *
 */
public class Category {

	
	private int genreId;
	private int movieId;
	private String genreName;
	/**
	 * @return the genreId
	 */
	public int getGenreId() {
		return genreId;
	}
	/**
	 * @param genreId the genreId to set
	 */
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	/**
	 * @return the movieId
	 */
	public int getMovieId() {
		return movieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	/**
	 * @return the genreName
	 */
	public String getGenreName() {
		return genreName;
	}
	/**
	 * @param genreName the genreName to set
	 */
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
}
