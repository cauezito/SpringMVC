package br.com.cauezito.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.cauezito.daos.ProductDAO;
import br.com.cauezito.store.controller.HomeController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class, ProductDAO.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setPrefix("/WEB-INF/views/products/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
	