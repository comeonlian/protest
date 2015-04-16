package com.lian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lian.dao.ILoginLogDao;
import com.lian.dao.IUserDao;
import com.lian.domain.LoginLog;
import com.lian.domain.User;
import com.lian.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;
	@Autowired
	private ILoginLogDao loginLogDao;
	
	public Boolean hasMatchUsesr(String userName, String password) throws Exception {
		Integer count = userDao.getMatchCount(userName, password);
		return count>0;
	}

	public User findUserByUserName(String userName) throws Exception {
		return userDao.findUserByUserName(userName);
	}
	@Transactional
	public void loginSuccess(User user) throws Exception {
		user.setCredits(5+user.getCredits());
		LoginLog log = new LoginLog();
		log.setUserId(user.getUserId());
		log.setIp(user.getLastIp());
		log.setLoginDate(user.getLastVisit());
		userDao.updateLoginLog(user);
		loginLogDao.insertLoginLog(log);
	}

}
