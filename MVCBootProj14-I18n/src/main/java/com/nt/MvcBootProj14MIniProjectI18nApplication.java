package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class MvcBootProj14MIniProjectI18nApplication {
	@Bean("localeResolver")
	public SessionLocaleResolver createSLResolver() {
		SessionLocaleResolver resolver = new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en_US"));
		return resolver;
	}

	@Bean
	public LocaleChangeInterceptor createLCInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

	public static void main(String[] args) {
		SpringApplication.run(MvcBootProj14MIniProjectI18nApplication.class, args);
	}

}
