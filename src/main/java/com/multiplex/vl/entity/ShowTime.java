/**
 * 
 */
package com.multiplex.vl.entity;

import java.util.Date;

/**
 * @author SHARDUL
 * 
 */
public class ShowTime {

	private int showtimeId;
	private Date showDate;
	private Date startTime;
	private Date endTime;

	/**
	 * @return the showtimeId
	 */
	public int getShowtimeId() {
		return showtimeId;
	}

	/**
	 * @param showtimeId
	 *            the showtimeId to set
	 */
	public void setShowtimeId(int showtimeId) {
		this.showtimeId = showtimeId;
	}

	/**
	 * @return the showDate
	 */
	public Date getShowDate() {
		return showDate;
	}

	/**
	 * @param showDate
	 *            the showDate to set
	 */
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
