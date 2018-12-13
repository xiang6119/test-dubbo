package vc.thinker.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan(basePackages="vc.thinker.dubbo")
public class ApiServiceMain {

	public static void main(String[] args) {
		SpringApplication.run(ApiServiceMain.class, args);
	}
}
