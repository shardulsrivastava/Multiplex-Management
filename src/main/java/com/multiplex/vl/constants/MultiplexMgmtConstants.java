/**
 * 
 */
package com.multiplex.vl.constants;

/**
 * The Class Containing Constants for Multilex Management System.
 * 
 * @author sharduls
 * 
 */
public class MultiplexMgmtConstants {

	/**
	 * JSON data tag from proxy.
	 */
	public static final String KEY_JSON_DATA = "jsonData=";

	/**
	 * The Constant JSON_TEMPLATE_ERROR.
	 */
	public static final String JSON_TEMPLATE_ERROR = "{header:{'status':404},body:{},footer:{}}";

	/**
	 * Error json response template.
	 */
	public static final String JSON_RESPONSE_ERROR = "{'header':{'status':401,'message':'#MESSAGE#'},'body':{},'footer':{}}";

	public static final String OPERATION_AUTHENTICATE = "authenticate";

}
