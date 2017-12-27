package com.di.sample.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.di.sample.services.Circle;
import com.di.sample.services.Shape;
import com.di.sample.services.Square;

@Configuration
@ComponentScan(basePackages = "com.di.sample.drawing")
public class AppConfig {
	@Bean
	@Qualifier("circle")
	public Shape circleShape() {
		return new Circle(); // Circle bean injected to component class Drawing
	}
	
	@Bean
	@Qualifier("square")
	public Shape squareShape() {
		return new Square(); // Square bean injected to component class Drawing
	}
}
