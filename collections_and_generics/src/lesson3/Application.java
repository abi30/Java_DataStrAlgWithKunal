package lesson3;

import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {

		LinkedHashSet<Animal> animals = new LinkedHashSet<Animal>();

		Animal animal1 = new Animal("cow", 3);
		Animal animal2 = new Animal("elephent", 7);
		Animal animal3 = new Animal("cow", 3);
		Animal animal4 = new Animal("cat", 6);
		Animal animal5 = new Animal("hen", 2);
		Animal animal6 = new Animal("duck", 5);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);

		for (Animal animal : animals) {
			System.out.println(animal);
		}

	}

}
