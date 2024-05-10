package com.example.SpringBootApp.Proxy.API.Zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.context.annotation.Bean;

import com.example.SpringBootApp.Proxy.API.Zuul.Filter.ErrorFilter;
import com.example.SpringBootApp.Proxy.API.Zuul.Filter.PostFilter;
import com.example.SpringBootApp.Proxy.API.Zuul.Filter.PreFilter;
import com.example.SpringBootApp.Proxy.API.Zuul.Filter.RouteFilter;
@EnableZuulProxy
@SpringBootApplication
public class SpringBootAppProxyApiZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppProxyApiZuulApplication.class, args);
	}
	
	@Bean
	PreFilter getPreFilter() {
		return new PreFilter();
	}
	
	@Bean
	PostFilter getPostFilter() {
		return new PostFilter();
	}

	@Bean
	RouteFilter getrouteFilter() {
		return new RouteFilter();
	}

	@Bean
	ErrorFilter getErrorFilter() {
		return new ErrorFilter();
	}


}
