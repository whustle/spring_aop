package com.lz.spring_aop.service;

import com.lz.spring_aop.dao.UserDao;
import com.lz.spring_aop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public List<User> find(int pageNum,int pageSize){
		/*List<User> list = userPaging(2,2);*/
		List<User> users = userDao.findusers();
		return users;
	}
	/*public List<User> userPaging(int pageNum,int pageSize){
		List<User> users = userDao.findusers();
		System.out.println("执行");
		return users;
	}*/
}
