package com.lz.spring_aop.aop;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lz.spring_aop.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class PageHelperAspect {
	@Pointcut("execution(public * *(..))")
	public void paging(){}
	@Around("paging() && args(pageNum,pageSize)")
	public Object around(ProceedingJoinPoint pjp,int pageNum,int pageSize) throws Throwable {
		System.out.println("前");
		PageHelper.startPage(pageNum,pageSize);
		Object obj = pjp.proceed();
		PageInfo pageInfo=new PageInfo();
		System.out.println("后");
		return obj;
	}
}
