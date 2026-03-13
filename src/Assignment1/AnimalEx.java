package Assignment1;

public class AnimalEx {
	    void eat() {
	        System.out.println("Animal eats food");
	    }
	}
	class Dog extends AnimalEx {
	    void bark() {
	        System.out.println("Dog barks");
	    }
	    public static void main(String[] args) {
	        Dog d = new Dog();
	        d.eat();   
	        d.bark();
	    }
	}
