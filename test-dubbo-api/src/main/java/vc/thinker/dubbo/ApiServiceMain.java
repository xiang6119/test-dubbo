package vc.thinker.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

/**
 * 主应用启动入口
 * @author ZhangGaoXiang
 * @date   2018年12月13日 下午4:09:33
 */
@SpringBootApplication
@DubboComponentScan(basePackages="vc.thinker.dubbo")
public class ApiServiceMain {

	public static void main(String[] args) {
		SpringApplication.run(ApiServiceMain.class, args);
	}
}
