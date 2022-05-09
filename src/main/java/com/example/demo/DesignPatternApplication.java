package com.example.demo;

import com.SingelotonClass.SingleTonObject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.FactoryPattern.ShapeFactory;
import com.FactoryPattern.Shape;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
		ShapeFactory shapeFactory = new ShapeFactory();
		// In Factory pattern, we create object without exposing the creation logic to
		// the client and refer to newly created object using a common interface.
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		// This pattern involves a single class which is responsible to create an object
		// while making sure that only single object gets created. This class provides a
		// way to access its only object which can be accessed directly without need to
		// instantiate the object of the class.
		SingleTonObject obj = SingleTonObject.getInstance();
		obj.showMessage();
	}

}
