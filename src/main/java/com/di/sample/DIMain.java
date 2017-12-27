package com.di.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.sample.config.AppConfig;
import com.di.sample.drawing.annotation.ADrawingWithConstructor;
import com.di.sample.drawing.annotation.ADrawingWithSetter;
import com.di.sample.drawing.xml.DrawingWithConstructor;
import com.di.sample.drawing.xml.DrawingWithSetter;

public class DIMain {

	public static void main(String[] args) {
		DrawUsingAnnotation();
		DrawUsingXML();
	}

	static void DrawUsingAnnotation() {
		// This takes the class which injects the bean in component class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// Will draw a circle
		ADrawingWithSetter drawing1 = context.getBean(ADrawingWithSetter.class);
		drawing1.draw();

		// Will draw a square
		ADrawingWithConstructor drawing2 = context.getBean(ADrawingWithConstructor.class);
		drawing2.draw();

		context.close();
	}

	static void DrawUsingXML() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Will draw a rectangle
		DrawingWithSetter drawing1 = context.getBean(DrawingWithSetter.class);
		drawing1.draw();

		// Will draw a triangle
		DrawingWithConstructor drawing2 = context.getBean(DrawingWithConstructor.class);
		drawing2.draw();

		context.close();
	}
}
