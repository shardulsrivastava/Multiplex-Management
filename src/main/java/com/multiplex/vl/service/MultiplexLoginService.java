package com.multiplex.vl.service;

import com.multiplex.vl.model.LoginRequest;
import com.multiplex.vl.model.LoginResponse;

public interface MultiplexLoginService extends MultiplexBaseService {

	public LoginResponse login(LoginRequest requestData);
	
	

}
