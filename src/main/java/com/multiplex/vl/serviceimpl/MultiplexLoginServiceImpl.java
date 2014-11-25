/**
 * 
 */
package com.multiplex.vl.serviceimpl;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.multiplex.vl.constants.MultiplexMgmtConstants;
import com.multiplex.vl.model.LoginRequest;
import com.multiplex.vl.model.LoginResponse;
import com.multiplex.vl.model.ServiceResponseHolder;
import com.multiplex.vl.service.MultiplexLoginService;
import com.multiplex.vl.util.JsonUtil;
import com.multiplex.vl.util.StringUtil;

/**
 * @author sharduls
 * 
 */
@Service("LoginService")
public class MultiplexLoginServiceImpl implements MultiplexLoginService {

	@Override
	public LoginResponse login(LoginRequest requestData) {
		// TODO Auto-generated method stub
		return new LoginResponse();
	}

	@Override
	public ServiceResponseHolder execute(String OperationName,
			String requestData) throws JsonMappingException, IOException,
			ParseException {
		// TODO Auto-generated method stub
		ServiceResponseHolder responseHolder = new ServiceResponseHolder();
		if (MultiplexMgmtConstants.OPERATION_AUTHENTICATE
				.equalsIgnoreCase(OperationName)) {

			LoginRequest request = JsonUtil.fromJson(requestData,
					LoginRequest.class);

			String name = request.getUserName();
			String password = request.getPassword();
			if (StringUtil.isEmpty(name)) {
				responseHolder
						.setUserNameError("Please Enter a Valid UserName");
			}
			if (StringUtil.isEmpty(password)) {
				responseHolder
						.setPasswordError("Please Enter a Valid Password");
			}
			if (StringUtil.isNotEmpty(name) && StringUtil.isNotEmpty(password)) {
				responseHolder.setSuccess(true);
			}

		}
		
		
		return responseHolder;
	}
}
