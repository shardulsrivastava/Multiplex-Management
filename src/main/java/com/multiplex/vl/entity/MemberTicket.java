/**
 * 
 */
package com.multiplex.vl.entity;

/**
 * @author SHARDUL
 * 
 */
public class MemberTicket {

	private int userId;
	private int showingTicketId;
	private String paymentMethod;

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
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @param paymentMethod
	 *            the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
