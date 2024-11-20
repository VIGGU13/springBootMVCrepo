package com.vrs.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.vrs.demo.User.User;
import com.vrs.demo.service.userSrviceImpl;

@Controller
public class MyController {
	
	@Autowired
	private userSrviceImpl servImpl;
	
	@GetMapping("/regForm")
	public String openRegister(Model model) {
		
		model.addAttribute("user", new User());
		
		return "register";
	}
	@PostMapping("/regForm")
	public String postForm(@ModelAttribute("user")User user,Model model) {
		
		boolean status=servImpl.addUser(user);
		if(status) {
			model.addAttribute("success", "User registrartion successfull");
		}else {
			model.addAttribute("error","Registrartion unsuccessfull!!Please Check again");
		}
		return "register";
	}
	
	@GetMapping("/logForm")
	public String loginPage(Model model) {
		model.addAttribute("user", new User());
		
		return "login";
	}
	@PostMapping("/logForm")
	public String submitLogin(@ModelAttribute("user")User user,Model model) {
		
		User validUser=servImpl.loginUser(user.getEmail(), user.getPassword());
		if(validUser!=null) {
			
			return "profile";
		}else {
			return "register";
		}
		
	}
}
