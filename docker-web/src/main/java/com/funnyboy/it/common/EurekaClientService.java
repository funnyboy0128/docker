package com.funnyboy.it.common;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

/**
 * @ClassName:EurekaClientService 
 * @Description:服务注册发现工具类
 * 
 * @author:funnyboy.ding@wiilead.com
 * @date:2018-4-10
 */
@Service
public class EurekaClientService {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	/**
	 * 根据指定服务ID获取URL,已做负载均衡
	 * @param serviceID：服务ID
	 * @param fallbackURI：获取失败备用URL地址
	 * @return
	 */
	public String getRestURL(String serviceID,String contextPath,String fallbackURI){
		
		URI uri = null;
		ServiceInstance instacne = null;
		try{
			
			instacne = loadBalancer.choose(serviceID);
			String scheme = instacne.isSecure() ? "https" : "http";
			int port = instacne.getPort();
			String host   = instacne.getHost();
			
			String url = String.format("%s://%s:%s", scheme,host,port);
			uri = URI.create(url);
			
		}catch (Exception e) {
			uri = URI.create(fallbackURI);
		}
		return uri.toString()+contextPath;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<String> getAllService(){
		List<String> serviceList = discoveryClient.getServices();
		return serviceList;
	}

}
