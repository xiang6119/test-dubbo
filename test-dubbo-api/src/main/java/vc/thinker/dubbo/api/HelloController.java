package vc.thinker.dubbo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import vc.thinker.dubbo.service.HelloService;


/**
 * api 控制器
 * @author ZhangGaoXiang
 * @date d2018年11月28日 下午6:38:46
 */

@RestController
@RequestMapping("hello")
@Api(value = "简单测试类", description = "提供与个人用户相关的api")
public class HelloController {
	
	/**
	 * check = false 
	 * 不检查依赖(即服务提供者不存在,也不影响消费者应用的启动)
	 */
	@Reference(check=false,retries=2)
	private HelloService helloService;
	
	
	@RequestMapping(value = "demo1" , method = { RequestMethod.GET})
	@ApiOperation(value="简单的测试",notes="简单的测试")
	public String demo1() {
		return "hahhahha";
	}
	
	@RequestMapping(value = "sayHello", method = { RequestMethod.GET})
	@ApiOperation(value="Dubbo 的第一个测试",notes="Dubbo 的第一个测试")
	public String sayHello(String name) {
		helloService.sayHello(name);
		return "hello " + name;
	}
}
