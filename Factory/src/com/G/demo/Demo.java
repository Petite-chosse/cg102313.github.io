package com.G.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShap("CIRCLE");//获取 Circle 的对象，并调用它的 draw 方法
		shape1.draw();
	}

}
