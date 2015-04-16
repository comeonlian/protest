package com.lian.dao;

import com.lian.domain.LoginLog;

public interface ILoginLogDao {
	
	public void insertLoginLog(LoginLog log)throws Exception;
	
}
