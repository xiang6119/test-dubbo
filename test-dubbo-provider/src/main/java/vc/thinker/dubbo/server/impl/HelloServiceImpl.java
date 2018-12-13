package vc.thinker.dubbo.server.impl;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;

import vc.thinker.dubbo.service.HelloService;


@Service(timeout=5000)
@Transactional
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
	
}
