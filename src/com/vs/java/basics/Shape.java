package com.vs.java.basics;
//abstract class Example
abstract class Shape {

	
	abstract void draw();
		
}

class Rect extends Shape{
	
	void draw() {
		System.out.println("Draw a rectangle");
		for(int i = 0 ; i<4 ; i++) {
			for (int j = 0; j < 2; j++ ) {
				System.out.println("_");
			}
			System.out.println("\n" + "|");
		}
	}
	
	public static void main(String[] args) {
		Shape obj = new Rect();
		obj.draw();
	}
}