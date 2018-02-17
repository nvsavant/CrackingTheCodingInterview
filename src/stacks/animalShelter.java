package stacks;

import java.util.LinkedList;
import java.util.List;

public class animalShelter {

	List<AnimalNode> dogQueue;
	List<AnimalNode> catQueue;

	public animalShelter() {
		this.dogQueue = new LinkedList<>();
		this.catQueue = new LinkedList<>();
	}

	public void enqueue(AnimalNode node) {
		if (node instanceof DogNode) {
			dogQueue.add(node);
		}
		if (node instanceof CatNode) {
			catQueue.add(node);
		}
	}

	public AnimalNode dequeueAny() {
		if (dogQueue.isEmpty() == true && catQueue.isEmpty() == true) {
			return null;
		} else if (dogQueue.isEmpty() == true && catQueue.isEmpty() == false) {
			return dequeueCat();
		} else if (dogQueue.isEmpty() == false && catQueue.isEmpty() == true) {
			return dequeueDog();
		} else {
			DogNode dog = (DogNode) dogQueue.get(0);
			CatNode cat = (CatNode) catQueue.get(0);
			if (dog.isOlderThan(cat)) {
				return dequeueDog();
			} else {
				return dequeueCat();
			}
		}
	}

	public AnimalNode dequeueDog() {
		if (dogQueue.isEmpty()) {
			return null;
		}
		return dogQueue.remove(0);
	}

	public AnimalNode dequeueCat() {
		if (catQueue.isEmpty()) {
			return null;
		}
		return catQueue.remove(0);
	}

	public static void main(String[] args) {

		animalShelter shelter = new animalShelter();

		AnimalNode dog1 = new DogNode("Tommy");
		AnimalNode dog2 = new DogNode("Rocky");
		AnimalNode dog3 = new DogNode("Dog");

		AnimalNode cat1 = new CatNode("kitten");
		AnimalNode cat2 = new CatNode("pussy");
		AnimalNode cat3 = new CatNode("cat");

		shelter.enqueue(cat1);
		shelter.enqueue(cat2);
		shelter.enqueue(cat3);

		// shelter.enqueue(dog1);
		shelter.enqueue(dog2);
		shelter.enqueue(dog3);

//		 System.out.println(shelter.dequeueAny().getName());
		 System.out.println(shelter.dequeueDog().getName());
//		 System.out.println(shelter.dequeueCat().getName());

	}

}
