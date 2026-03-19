/*
Demonstrating method Overriding in Java
function Signature should be same 
function return type should be same 
overriding methods should be non-static
*/

class Vehicle{
	static void sound(){
		System.out.println("Unknown sound");
	}
	void move(){
		System.out.println("Vehicls is moving..");
	}
}

class Car extends Vehicle{
	void move(){
		System.out.println("Car is moving");
	}
	static void sound(){
		System.out.println("hmm...hmmm");
	}
}

class FourthMain{
	public static void main(String[] args){
		Car c1=new Car();
		c1.move();
		c1.sound();

		//but

		Vehicle v1=new Car();
		v1.move();
		v1.sound();//noot override it because sound( ) method is static ,can't be override 
	}
}