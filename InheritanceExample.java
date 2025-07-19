class Animal{
    void eat(){
       System.out.println("This animal east food");
   }
}
class Dog extends Animal{
    void bark(){
    System.out.println("the dog is barking");
}
}
public class InheritanceExample{
    public static void main (String args[]){
       Dog d= new Dog();
       d.eat();
       d.bark();
}
}
