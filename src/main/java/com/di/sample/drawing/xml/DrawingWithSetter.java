package com.di.sample.drawing.xml;

import com.di.sample.services.Shape;

public class DrawingWithSetter { // For this class to be treated as a component
	// Drawing class does not need to know what shape is coming in,
	// taken care by Spring
	private Shape shape;

	public DrawingWithSetter() {
		super();
	}

	// Setter based dependency injection
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void draw() {
		shape.drawShape();
	}

}
