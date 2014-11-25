/**
 * 
 */
package com.multiplex.vl.util;

/**
 * @author sharduls
 *
 */
/**
 * Utility class for string based utilities.
 * 
 * @author: kpremkumar
 */
public final class StringUtil {

	/**
	 * It avoids object creation.
	 */
	private StringUtil() {

	}

	/**
	 * It stores empty string.
	 */
	public static final String EMPTY_STRING = "";

	/** The Constant EMPTY_STRING_NULL. */
	public static final String EMPTY_STRING_NULL = "null";

	/**
	 * It stores new line.
	 */
	public static final String NEW_LINE = "\n";

	/**
	 * It checks for empty string.
	 * 
	 * @param str
	 *            accepts string as input.
	 * @return boolean returns boolean as output
	 */
	public static boolean isEmpty(final String str) {

		return str == null || EMPTY_STRING.equals(str)
				|| EMPTY_STRING_NULL.equals(str);

	}

	/**
	 * It checks for non-empty string.
	 * 
	 * @param str
	 *            accepts string as input.
	 * @return boolean returns boolean as output
	 */
	public static boolean isNotEmpty(final String str) {
		return !isEmpty(str);
	}

	/**
	 * It checks for blank.
	 * 
	 * @param str
	 *            accepts string as input
	 * @return boolean returns boolean as output
	 */
	public static boolean isBlank(final String str) {
		return isEmpty(trim(str));
	}

	/**
	 * It checks for non-blank.
	 * 
	 * @param str
	 *            accepts string as input
	 * @return boolean returns true or false as output
	 */
	public static boolean isNotBlank(final String str) {
		return !isBlank(str);
	}

	/**
	 * It trims string whether any spaces at starting position or in ending
	 * position.
	 * 
	 * @param str
	 *            It accepts string as input.
	 * @return String It returns string value after trimming.
	 */
	public static String trim(final String str) {
		if (str == null) {
			return null;
		}
		return str.trim();
	}

	/**
	 * It checks whether data is equal or not in two string objects.
	 * 
	 * @param str1
	 *            accepts string data.
	 * @param str2
	 *            accepts string data.
	 * @return boolean returns true or false.
	 */
	public static boolean equals(final String str1, final String str2) {
		if (str1 == null && str2 == null) {
			return true;
		}
		if (str1 == null || str2 == null) {
			return false;
		}
		if (str1.equals(str2)) {
			return true;
		}
		return str1.equals(str2);
	}

	/**
	 * Checks if is numeric.
	 * 
	 * @param str
	 *            the str
	 * @return true, if is numeric
	 */
	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
