public class Constructors {
    public static void main(String[] args) {
        Student s1= new Student("Preeti Yadav");
        System.out.println(s1.name);
        Student s= new Student();
        System.out.println(s);
    }
}
class Student{
    String name;
    Student(){
        System.out.println("Non-parametrized Constructor");
    }
    Student(String name){
        this.name= name;
        System.out.println("Parametrized Constructor");
    }
}