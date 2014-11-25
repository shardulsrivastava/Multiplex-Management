/**
 * 
 */
package com.multiplex.vl.entity;

import java.sql.Date;

/**
 * @author SHARDUL
 * 
 */
public class Person {

	private int ssn;
	private String name;
	private Date dateOfBirth;
	private String gender;
	private String profession;
	private byte[] summary;
	private byte[] image;

	/**
	 * @return the ssn
	 */
	public int getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
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
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession
	 *            the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
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
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}

	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}
}
