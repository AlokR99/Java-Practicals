/*
Demonstrating upcasting in Java
*/

class Animal{
	Animal(){
		System.out.println("Hey! I am Animal."+this);
	}
}

class Dog extends Animal{
	String name;
	Dog(String name){
		this.name=name;
		System.out.println("DOG: "+this.name);
		System.out.println("Hey! I am Dog.");
	}
	public static void main(String... args){
		Animal dog1=new Dog("Tommy"); // UPCASTING
		System.out.println("dog1 "+dog1);
	}
}