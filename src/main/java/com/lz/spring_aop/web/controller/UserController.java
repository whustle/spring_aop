package com.lz.spring_aop.web.controller;

import com.lz.spring_aop.entity.User;
import com.lz.spring_aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/getUser")
	public List<User> getUses(){
		List<User> users = userService.find(2,2);
		return users;
	}
}
