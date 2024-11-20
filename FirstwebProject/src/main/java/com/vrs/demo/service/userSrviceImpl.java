package com.vrs.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrs.demo.User.User;
import com.vrs.demo.repository.userRepo;

@Service
public class userSrviceImpl implements userSrvice
{
	
 @Autowired
  public userRepo usre;
	@Override
	public boolean addUser(User user) {
		
	User us=usre.save(user);
    try {
		System.out.println(us);
		return true;
	}catch (Exception e) {
		e.printStackTrace();
		return false;
	} 
	}
	@Override
	public User loginUser(String email, String password) {
		User validUser=usre.findByEmail(email);
		if(validUser!=null && validUser.getPassword().equals(password)) {
			return 	validUser;
		}
		return null;
	}
}
