package com.di.sample.drawing.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.di.sample.services.Shape;

@Component
public class ADrawingWithConstructor { // For this class to be treated as a component
	// Drawing class does not need to know what shape is coming in,
	// taken care by Spring
	private Shape shape;

	// Constructor based dependency injection
	@Autowired
	public ADrawingWithConstructor(@Qualifier("square") Shape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
		shape.drawShape();
	}

}
