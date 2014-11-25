/**
 * 
 */
package com.multiplex.vl.entity;

import java.util.Date;

/**
 * @author SHARDUL
 * 
 */
public class Movie {

	private int movieId;
	private String title;
	private Date year;
	private int minLength;
	private byte[] summary;
	private byte[] poster;
	private String pgRating;

	/**
	 * @return the movieId
	 */
	public int getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId
	 *            the movieId to set
	 */
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the year
	 */
	public Date getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(Date year) {
		this.year = year;
	}

	/**
	 * @return the minLength
	 */
	public int getMinLength() {
		return minLength;
	}

	/**
	 * @param minLength
	 *            the minLength to set
	 */
	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	/**
	 * @return the summary
	 */
	public byte[] getSummary() {
		return summary;
	}

	/**
	 * @param summary
	 *            the summary to set
	 */
	public void setSummary(byte[] summary) {
		this.summary = summary;
	}

	/**
	 * @return the poster
	 */
	public byte[] getPoster() {
		return poster;
	}

	/**
	 * @param poster
	 *            the poster to set
	 */
	public void setPoster(byte[] poster) {
		this.poster = poster;
	}

	/**
	 * @return the pgRating
	 */
	public String getPgRating() {
		return pgRating;
	}

	/**
	 * @param pgRating
	 *            the pgRating to set
	 */
	public void setPgRating(String pgRating) {
		this.pgRating = pgRating;
	}
}
