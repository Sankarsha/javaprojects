package demo.java;

public class Abr {
				public static void main(String[] args) {
			class Dog extends Animal{
				void makeSound() {
				System.out.println("My Dog name is Rony");
				}
				}

			Dog d=new Dog();
			d.eat();
			d.makeSound();

		}

	}

	abstract class Animal {
	abstract void makeSound();
	public void eat() {
	System.out.println("Lion is a carnivourous animal"); 
	}
	}