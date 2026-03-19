/*
Demonstrating upcasting and downcasting in Java
*/

class Animal{
	Animal(){
		System.out.println("Hey! I am Animal."+this);
	}
	void classCheck(){
		System.out.println("Method of Animal class");
	}
}

class Dog extends Animal{
	String name;
	Dog(String name){
		this.name=name;
		// System.out.println("DOG: "+this.name);
		System.out.println("Hey! I am Dog.");
	}
	void classCheck(){
		System.out.println("Method of Dog class");
	}
}

class SecondMain{
	public static void main(String... args){

		Animal dog1=new Dog("Tommy"); // UPCASTING
		dog1.classCheck();


		//Mistake in downcasting
		// Animal is not Dog
		
/*
		Dog dog3=new Animal();
		dog3.classCheck();
*/


		//Downcasting
		Dog dog2=(Dog) dog1;
		dog2.classCheck();
	}
}