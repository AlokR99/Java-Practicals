/*
Demonstrating method Overriding in Java
*/

class Shape{
	Shape(){
		System.out.println("Shape Constructor called");
	}
	double Area(){
		System.out.println("Shape Type is not cleared:");
		return 0.0;
	}
}

class Square extends Shape{
	int side;
	Square(int side){
		this.side=side;
		System.out.println("I am Square: "+side);
	}
	double Area(){
		System.out.print("The area of the Square is:");
		return this.side*this.side;
	}
}

class Circle extends Shape{
	int radius;
	Circle(int radius){
		this.radius=radius;
		System.out.println("I am Circle with radius: "+radius);
	}
	double Area(){
		System.out.print("The area of the Circle is:");
		return 3.14*this.radius*this.radius;
	}
}

class AreaCalculation{
	Square sq=new Square(10);
	System.out.println(sq.Area());

	Square c1=new Circle(10);
	System.out.println(c1.Area());
}