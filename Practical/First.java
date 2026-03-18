/*
Demonstrating Single Inheritance and functionality of super() keyword
*/

class Animal{
	String animalType;
	Animal(String animalType){
		this.animalType=animalType;
		System.out.println("Hey! I am "+this.animalType);
	}
}

class Dog extends Animal{
	String name;
	Dog(String name,String animalType){
		super(animalType);
		System.out.println("DOG: ");
		System.out.println("Hey! I am "+name+".");
	}
	
	public static void main(String... args){
		Dog dog1=new Dog("Tommy","Mammal");
	}
}