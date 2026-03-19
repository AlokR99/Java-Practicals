/*
Demonstrating Multilevel Inheritance
*/

class Ecosystem{
	Ecosystem(){
		System.out.println("I am Ecosystem");
	}
}
class AquaticEcosystem extends Ecosystem{
	AquaticEcosystem(){
		System.out.println("I am Aquatic Ecosystem");
	}
}
class WaterBody extends AquaticEcosystem{
	String taste;
	WaterBody(String taste){
		System.out.println("Hello! I am water-body & my taste is :"+taste);
	}	
}

class Ocean extends WaterBody{
	String name;
	Ocean(String name, String taste){
		super(taste);
		this.name=name;
		System.out.println("I am Ocean: "+this.name);
	}
		
}

class ThirdMain{
	public static void main(String... args){
		Ocean ocean1=new Ocean("Pacific","salty");
	}
}