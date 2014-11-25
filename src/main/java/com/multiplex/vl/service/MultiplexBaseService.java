/**
 * 
 */
package com.multiplex.vl.service;

import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.multiplex.vl.model.ServiceResponseHolder;

/**
 * @author sharduls
 * 
 */
public interface MultiplexBaseService {

	/**
	 * Execute.
	 * 
	 * @param OperationName
	 *            the operation name
	 * @param requestData
	 *            the request data
	 * @return the service response holder
	 * @throws JsonGenerationException
	 *             the json generation exception
	 * @throws JsonMappingException
	 *             the json mapping exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws RmwbException
	 *             the rmwb exception
	 * @throws ParseException
	 *             the parse exception
	 */
	ServiceResponseHolder execute(String OperationName, String requestData)
			throws JsonMappingException, IOException, ParseException;

}
