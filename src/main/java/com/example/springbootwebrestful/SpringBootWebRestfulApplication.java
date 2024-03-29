package com.example.springbootwebrestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBootWebRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebRestfulApplication.class, args);
	}


	@Bean
	public ViewResolver myViewResolver(){
		return  new MyViewReslover();
	}
	private  static class MyViewReslover implements ViewResolver{

		@Nullable
		@Override
		public View resolveViewName(String viewName, Locale locale) throws Exception {
			return null;
		}
	}
}
