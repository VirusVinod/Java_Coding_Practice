package ArrayConcept;

public class Polymorphism {
	class Animal {
		public void animalSound() {
			System.out.println("The animal makes a sound");
		}
	}

	class Pig extends Animal {
		public void animalSound() {
			System.out.println("The pig says: wee wee");
		}
	}

	class Dog extends Animal {
		public void animalSound() {
			System.out.println("The dog says: bow wow");
		}
	}

	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		
		Animal myAnimal = polymorphism.new Animal();
		Animal myPig = polymorphism.new Pig();
		Animal myDog = polymorphism.new Dog();

		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}

}
