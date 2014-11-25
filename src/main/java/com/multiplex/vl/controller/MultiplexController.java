/**
 * 
 */
package com.multiplex.vl.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.multiplex.vl.constants.MultiplexMgmtConstants;
import com.multiplex.vl.model.ServiceResponseHolder;
import com.multiplex.vl.service.MultiplexBaseService;
import com.multiplex.vl.service.MultiplexManagementServiceFactory;
import com.multiplex.vl.util.JsonUtil;

/**
 * Handles requests for the application home page.
 * 
 * @author sharduls
 * 
 */
@RestController
public class MultiplexController {

	ServiceResponseHolder serviceResponseHolder = null;

	private static final Logger logger = LoggerFactory
			.getLogger(MultiplexController.class);

	@Autowired
	private MultiplexManagementServiceFactory serviceFactory;

	/**
	 * Handle request for data.
	 * 
	 * @param serviceName
	 *            the service name
	 * @param operationName
	 *            the operation name
	 * @param requestMessageJson
	 *            the request message json
	 * @param request
	 *            the request
	 * @return the string
	 * @throws Exception
	 *             the exception
	 */
	@RequestMapping(value = "/multiplex/{serviceName:.*Service}/{operationName}", method = {
			RequestMethod.GET, RequestMethod.POST }, produces = "application/json")
	public final String handleRequestForData(
			@PathVariable final String serviceName,
			@PathVariable final String operationName,
			@RequestBody final String requestMessageJson,
			HttpServletRequest request) throws Exception {

		return invokeMethod(serviceName, operationName,
				decodeRequestMessage(requestMessageJson), request);
	}

	/**
	 * Decode the param if it starts with "jsonData="
	 * 
	 * @param requestMessage
	 * @return
	 */
	private String decodeRequestMessage(String requestMessage) {
		String requestJSON = requestMessage;
		try {
			requestJSON = URLDecoder.decode(requestMessage, "UTF-8");
			if (requestJSON.startsWith(MultiplexMgmtConstants.KEY_JSON_DATA)) {
				requestJSON = requestJSON.replace(
						MultiplexMgmtConstants.KEY_JSON_DATA, "");
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return requestJSON;
	}

	/**
	 * Invoke method.
	 * 
	 * @param serviceName
	 *            the service name
	 * @param operationName
	 *            the operation name
	 * @param requestData
	 *            the request data
	 * @param request
	 *            the request
	 * @return the string
	 * @throws Exception
	 *             the exception
	 */
	private String invokeMethod(final String serviceName,
			final String operationName, final String requestData,
			HttpServletRequest request) throws Exception {

		MultiplexBaseService service = serviceFactory
				.getServiceInstance(serviceName);
		logger.info(serviceName + "/" + operationName + " started");
		serviceResponseHolder = service.execute(operationName, requestData);

		logger.info(serviceName + "/" + operationName + " completed");
		return toJSON();
	}

	/**
	 * Convert the pojo.
	 * 
	 * @return as string
	 */
	public String toJSON() {
		String json = MultiplexMgmtConstants.JSON_TEMPLATE_ERROR;
		if (serviceResponseHolder != null) {
			try {
				json = JsonUtil.toJson(serviceResponseHolder);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return json;
	}

	/**
	 * Handle exception.
	 * 
	 * @param ex
	 *            the ex
	 * @return the string
	 */
	@ExceptionHandler(Exception.class)
	private String handleException(Exception ex) {
		ex.printStackTrace();

		logger.info("Exception", ex.getMessage());
		String json = MultiplexMgmtConstants.JSON_RESPONSE_ERROR;

		return json.replaceAll("#MESSAGE#", ex.getMessage());
	}

	/**
	 * Method Which handles Login GET
	 * 
	 * @param userConfiguration
	 *            - DTO Containing login information.
	 * 
	 * @return LoginResponse - A DTO Containing The Success or Failure
	 *         Information.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("home");
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return new ModelAndView("redirect:login");
	}

}
