public class MultiLevelinheritance {
    public static void main(String[] args) {
        Dog johhny= new Dog();
        johhny.eat();
        johhny.legs=4;
        System.out.println(johhny.legs);
    }
}

//Example of multi-level Inheritance

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

class Mammals extends Animal{
    int legs;

}

class Dog extends Mammals{
    String breed;
}