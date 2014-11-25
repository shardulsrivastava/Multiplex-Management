/**
 * 
 */
package com.multiplex.vl.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author sharduls
 *
 */
/**
 * Convenience methods to work with Collection classes.
 */
public final class CollectionUtil {

	/**
	 * This constructor avoids object creation for utililty classes.
	 */
	private CollectionUtil() {
	}

	/**
	 * It checks for empty collection.
	 * 
	 * @param collection
	 *            It accepts any sub class of collection.
	 * @return boolean value true or false.
	 */
	public static boolean isEmpty(final Collection collection) {
		return collection == null || collection.isEmpty();
	}

	/**
	 * It checks for non-empty collection.
	 * 
	 * @param collection
	 *            It accepts any sub class of collection.
	 * @return boolean value true or false.
	 */
	public static boolean isNotEmpty(final Collection collection) {
		return !isEmpty(collection);
	}

	/**
	 * It appends the data in the list.
	 * 
	 * @param <T>
	 *            It accepts any object inside the list.
	 * @param source
	 *            It accepts source data.
	 * @param target
	 *            It accepts target data.
	 * @return appendList the append list of source and target.
	 */
	public static <T> List<T> append(final List<T> source, final List<T> target) {
		List<T> appendedList = new ArrayList<T>();
		if (isNotEmpty(source)) {
			appendedList.addAll(source);
		}
		if (isNotEmpty(target)) {
			appendedList.addAll(target);
		}
		return appendedList;
	}

	/**
	 * Fetches the first value of a list or null if the list is empty.
	 * 
	 * @param <T>
	 *            - The generic parameter.
	 * @param values
	 *            List<T> - The values.
	 * @return T - The value.
	 */
	public static <T> T getFirstOrNull(List<T> values) {
		return (!values.isEmpty()) ? values.get(0) : null;
	}

}
