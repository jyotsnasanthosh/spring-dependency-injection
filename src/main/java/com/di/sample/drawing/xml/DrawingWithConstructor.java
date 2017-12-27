package com.di.sample.drawing.xml;

import com.di.sample.services.Shape;

public class DrawingWithConstructor { // For this class to be treated as a component
	// Drawing class does not need to know what shape is coming in,
	// taken care by Spring
	private Shape shape;

	// Constructor based dependency injection
	public DrawingWithConstructor(Shape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
		shape.drawShape();
	}

}
