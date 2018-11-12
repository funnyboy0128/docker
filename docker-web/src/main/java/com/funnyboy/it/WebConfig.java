package com.funnyboy.it;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:这里用一句话描述这个类的作用
 * @author:funnyboy.ding@wiilead.com
 * @date:2018年11月12日
 */
@Configuration  
@EnableSwagger2  
public class WebConfig {
	
	@Bean
	public RestTemplate getRestTemplate(){
		
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory(); 
		RestTemplate restTemplate = new RestTemplate(requestFactory); 
		
		return restTemplate;
	}

}
