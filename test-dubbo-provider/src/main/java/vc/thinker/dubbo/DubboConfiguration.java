package vc.thinker.dubbo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;

@Configuration
public class DubboConfiguration {

	@Bean
	public ApplicationConfig applicationConfig() {
		
		ApplicationConfig applicationConfig = new ApplicationConfig();
		
		applicationConfig.setName("provider-test");
		return applicationConfig;
	}
	
	@Bean
	public ProviderConfig providerConfig() {
		ProviderConfig  providerConfig = new ProviderConfig();
		providerConfig.setTimeout(5000);
//		providerConfig.setStatus("xxx,yyy");
		return providerConfig;
		
	}
	
	@Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://192.168.1.10:2181");
        registryConfig.setClient("curator");
        return registryConfig;
    }
	
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		return protocolConfig;
	}
	
}
