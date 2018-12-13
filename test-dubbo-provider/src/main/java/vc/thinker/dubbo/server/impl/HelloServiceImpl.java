package vc.thinker.dubbo.server.impl;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;

import vc.thinker.dubbo.service.HelloService;

/**
 * @author ZhangGaoXiang
 * @date   2018年12月13日 下午4:30:06
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
	
}
