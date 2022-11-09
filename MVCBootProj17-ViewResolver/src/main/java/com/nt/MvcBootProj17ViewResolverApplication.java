package com.nt;

import javax.naming.spi.Resolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@SpringBootApplication
public class MvcBootProj17ViewResolverApplication {
	// for InternalResourceViewResolver
	/*@Bean
	public InternalResourceViewResolver createIRVR() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}*/


	/*	@Bean
		public UrlBasedViewResolver createIRVR() {
			UrlBasedViewResolver resolver=new UrlBasedViewResolver();
			resolver.setPrefix("WEB-INF/pages/");
			resolver.setSuffix(".jsp");
			resolver.setViewClass(InternalResourceView.class);
			return resolver;
		}*/
	
	@Bean
	public ResourceBundleViewResolver createRBVR() {
		ResourceBundleViewResolver resolver = new ResourceBundleViewResolver();
		resolver.setBasename("com/nt/commons/view");
		return resolver;
	}

	public static void main(String[] args) {
		SpringApplication.run(MvcBootProj17ViewResolverApplication.class, args);
	}

}
