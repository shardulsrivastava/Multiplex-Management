/**
 * 
 */
package com.multiplex.vl.entity;

/**
 * @author SHARDUL
 * 
 */
public class ShowingTicket {

	private int showingTicketId;
	private int roomNumber;
	private int showTimeId;
	private int movieId;
	private int availableTickets;
	private int price;

	/**
	 * @return the showingTicketId
	 */
	public int getShowingTicketId() {
		return showingTicketId;
	}

	/**
	 * @param showingTicketId
	 *            the showingTicketId to set
	 */
	public void setShowingTicketId(int showingTicketId) {
		this.showingTicketId = showingTicketId;
	}

	/**
	 * @return the roomNumber
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * @param roomNumber
	 *            the roomNumber to set
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	 * @return the showTimeId
	 */
	public int getShowTimeId() {
		return showTimeId;
	}

	/**
	 * @param showTimeId
	 *            the showTimeId to set
	 */
	public void setShowTimeId(int showTimeId) {
		this.showTimeId = showTimeId;
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
	 * @return the availableTickets
	 */
	public int getAvailableTickets() {
		return availableTickets;
	}

	/**
	 * @param availableTickets
	 *            the availableTickets to set
	 */
	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

}
