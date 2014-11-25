/**
 * 
 */
package com.multiplex.vl.entity;

/**
 * @author SHARDUL
 * 
 */
public class Writer {

	private int SSN;
	private String name;
	private String movieId;

	/**
	 * @return the sSN
	 */
	public int getSSN() {
		return SSN;
	}

	/**
	 * @param sSN
	 *            the sSN to set
	 */
	public void setSSN(int sSN) {
		SSN = sSN;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}

	/**
	 * @param movieId
	 *            the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

}
