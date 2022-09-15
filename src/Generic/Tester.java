package Generic;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass<String> str = new MyClass<String>("I am string");
		
		MyClass<Double> salary = new MyClass<Double>(23.44);
		
		Dog dog = new Dog();
		
//		dog.animalSound();
		
		By2 by = new By2();
		
		System.out.println(by.getNext());
	}

}
