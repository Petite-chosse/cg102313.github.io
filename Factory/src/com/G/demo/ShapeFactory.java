package com.G.demo;

public class ShapeFactory {
	public Shape getShap(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		return null;
	}
}
