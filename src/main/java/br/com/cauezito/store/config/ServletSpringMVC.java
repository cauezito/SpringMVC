package br.com.cauezito.store.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.cauezito.store.controller.HomeController;
import br.com.cauezito.store.controller.ProductsController;
//Inherit from class not to do all configuration manually
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {
				AppWebConfiguration.class, JPAConfiguration.class};
				
	}

	//Returns one or more classes responsible for indicating which other
	//classes will be read during application loading
	@Override
	protected Class<?>[] getServletConfigClasses() {
			
			return new Class[] {};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
