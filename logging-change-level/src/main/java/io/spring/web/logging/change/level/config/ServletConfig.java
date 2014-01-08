package io.spring.web.logging.change.level.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import ch.qos.logback.classic.LoggerContext;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "io.spring.web.logging.change.level.service",
		"io.spring.web.logging.change.level.controller" })
public class ServletConfig {

	@Bean
	public LoggerContext loggerContext() {
		return (LoggerContext) LoggerFactory.getILoggerFactory();
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
