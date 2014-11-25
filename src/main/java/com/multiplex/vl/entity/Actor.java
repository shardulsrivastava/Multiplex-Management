/**
 * 
 */
package com.multiplex.vl.entity;

/**
 * @author SHARDUL
 * 
 */
public class Actor {

	private int SSN;
	private String name;
	private String movieId;
	private String role;

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

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

}
