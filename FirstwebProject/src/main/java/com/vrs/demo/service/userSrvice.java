package com.vrs.demo.service;

import com.vrs.demo.User.User;

public interface userSrvice 
{

	public boolean addUser(User user);
	public User loginUser(String email,String password);
}
