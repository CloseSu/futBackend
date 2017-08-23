package com.futureBacken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.futureBacken.model.User;
import com.futureBacken.service.UserService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 4800, allowCredentials = "false") 
public class LogerController {
	
	private User user;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getUser/{name}",produces = "application/json")
	public User first(@PathVariable String name) {
		user = new User();
		user.setUserId(1L);
		user.setUsername(name);
		user.setPassword("123456");
		System.out.println("test");
		return user;
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST, produces = "application/json")
	public String signUp(@RequestBody User user) {
		String name = user.getUsername();
		String password = user.getPassword();
		System.out.println(name);
		System.out.println(password);
		
        return "'result':'true'";
	}
	
	
}