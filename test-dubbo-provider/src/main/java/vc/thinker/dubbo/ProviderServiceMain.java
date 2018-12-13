package vc.thinker.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="vc.thinker.dubbo")
@DubboComponentScan(basePackages="vc.thinker.dubbo")
public class ProviderServiceMain {

	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceMain.class, args);
	}
	
}
