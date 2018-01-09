/*package com.bridgelabz.model;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringwebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		
		AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
		applicationContext.register();
		
		//Dispatcher Servlet
		ServletRegistration.Dynamic dispatcher=ServletContext.addServlet("SpringDispatcher", new DispatcherServlet(applicationContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		dispatcher.setInitParameter("contextClass",applicationContext.getClass().getName() );
		ServletContext.addListener(new ContextLoaderListener(applicationContext));
		
		//UTF8 Charactor Filter.
		FilterRegistration.Dynamic filterRegistration=ServletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		
		filterRegistration.setInitParameter("encoding", "UTF-8");
		filterRegistration.setInitParameter("ForceEncoding", "true");
		filterRegistration.addMappingForUrlPatterns(null, true, "/*");
		

	}

}
*/