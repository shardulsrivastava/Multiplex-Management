/**
 * 
 */
package com.multiplex.vl.entity;

/**
 * @author SHARDUL
 * 
 */
public class RateActor {

	private int userId;
	private int SSN;
	private String role;
	private int movieId;
	private int rating;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

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
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

}
