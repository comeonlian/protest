package com.lian.dao;

import org.apache.ibatis.annotations.Param;

import com.lian.domain.User;

public interface IUserDao {
	/*
	 * 根据用户名、密码匹配用户
	 */
	public Integer getMatchCount(@Param(value = "userName") String userName,
			@Param(value = "password") String password) throws Exception;

	/*
	 * 根据用户名查找对象
	 */
	public User findUserByUserName(@Param(value = "userName") String userName)
			throws Exception;

	/*
	 * 更新信息
	 */
	public void updateLoginLog(User user) throws Exception;
}
