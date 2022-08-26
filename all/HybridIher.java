public class HybridIher {
    public static void main(String[] args) {
        Fish shark= new Fish();
        Mammals human= new Mammals();
        human.breathe();
        shark.eat();
        Bird sparrow= new Bird();
        sparrow.fly();

        Human human1= new Human();
        human1.walk();
    }
}
//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

//child class one
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}

//child class 2nd
class Bird extends Animal{
    int wings;
    void fly(){
        System.out.println("Fly high under blue sky");
    }
}
//child class third
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("walks on surface");
    }
}

//child class for mammal
class Human extends Mammals{
    int hands;
    void speaks(){
        System.out.println("speaks by languages");
    }
}

//child class for mammals
class Dog extends Mammals{
    String feeling;
    void emotions(){
        System.out.println("dogs have strong connectional emotions");
    }
}

//child class for mammals
class cat extends Mammals{
    int nailSize;
    void sweet(){
        System.out.println("Cats are sweetest creator");
    }
}