public class HierarchcialInheritance{
    public static void main(String[] args) {
        Fish shark= new Fish();
        Mammals human= new Mammals();
        human.breathe();
        shark.eat();
        Bird sparrow= new Bird();
        sparrow.fly();
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