package Testing.harryJava;

// package com.aditya.shape;

class Rectangle{
	int length;
	int width;
	void Area() {
		System.out.println(length*width);
	}
}

class Square extends Rectangle {
	void Area() {
		System.out.println(length*length);
	}	
}

class Cylinder extends Rectangle {
	int radius;
	void Area() {
		System.out.println(Math.PI*radius*length);
	}
}

public class Shapes {
	public static void main(String[] args){
		Rectangle r = new Rectangle();
		r.length = 2;
		r.width = 2;
		r.Area();
	}

}