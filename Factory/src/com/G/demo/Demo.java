package com.G.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShap("CIRCLE");//��ȡ Circle �Ķ��󣬲��������� draw ����
		shape1.draw();
	}

}
