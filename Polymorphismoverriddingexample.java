class Animal{
    void sound(){
    System.out.println("animal makes sound");
}
}
class Dog extends Animal{
    void sound(){
      System.out.println("dog barks");
}
}
class Cat extends Animal{
     void sound(){
       System.out.println("Cat meows");
}
}
public class Polymorphismoverriddingexample{
    public static void main(String args[]){
        Animal a;
        a=new Dog();
        a.sound();
        a=new Cat();
        a.sound();
}
}