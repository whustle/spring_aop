package com.lz.spring_aop.dao;

import com.lz.spring_aop.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component
public interface UserDao {
	@Select("select * from t_user")
	List<User> findusers();
}
