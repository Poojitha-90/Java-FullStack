abstract class Animal{
    abstract void sound();
    void sleep(){
    System.out.println("Sleeping")
}
}
class Dog extends Animal(     // using extend keyword we will access the main class methods and variables into the subclass using extends keyword
    void sound(){
        System.out.println("dog Barks");
}
}
public class AbstractionExample{
   public static void main(String [] args){ // we cannot change abstract method in the main class 
      Dog d = new Dog();
        d.sound();
        d.sleep();
}
}

