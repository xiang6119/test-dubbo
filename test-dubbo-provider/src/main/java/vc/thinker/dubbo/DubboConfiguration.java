package vc.thinker.dubbo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * 集成Dubbo配置
 * @author ZhangGaoXiang
 * @date   2018年12月13日 下午4:28:28
 */
@Configuration
public class DubboConfiguration {
	
	@Value("${dubbo.app.name}")
	private String applicationName;

	@Value("${dubbo.zookeeper.url}")
	private String zookeeperUrl;

	/**
	 * 设置服务名称
	 * @return
	 */
	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(applicationName);
		return applicationConfig;
	}
	
	/**
	 * 设置注册中心地址
	 * @return
	 */
	@Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(zookeeperUrl);
        return registryConfig;
    }
	
	/**
	 * 设置netty端口号
	 * @return
	 */
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig config = new ProtocolConfig();
//		config.setName("netty-port");
//		config.setPort(20880);
		return config ;
	}
	
	@Bean
	public ProviderConfig providerConfig() {
		ProviderConfig  providerConfig = new ProviderConfig();
		providerConfig.setTimeout(5000);
		return providerConfig;
	}
	
}
