package com.lian.service;

import com.lian.domain.User;

public interface IUserService {
	
	public Boolean hasMatchUsesr(String userName,String password)throws Exception;
	
	public User findUserByUserName(String userName)throws Exception;
	
	public void loginSuccess(User user)throws Exception;
	
}
