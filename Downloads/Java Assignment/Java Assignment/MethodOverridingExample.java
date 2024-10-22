class Animal {
    public void sound() {
     System.out.println("Animal makes a sound");
 }
}
class Dog extends Animal {
       public void sound() {
     System.out.println("Dog barks");
 }
}
public class MethodOverridingExample {
 public static void main(String[] args) {
       Animal animal = new Animal();
     animal.sound(); 
     Dog dog = new Dog();
     dog.sound(); 
     Animal myAnimal = new Dog();
     myAnimal.sound();  
 }
}
