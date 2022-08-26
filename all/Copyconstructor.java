public class Copyconstructor {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Preeti";
        s1.roll= 123;
        s1.portalPassword="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;

        // System.out.println(s1.name);

        // suppose student 1 forgot her password
        Student s2= new Student(s1);
        s2.portalPassword= "xyz";
        
        for(int i=0;i<2;i++){
            System.out.println(s1.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    String portalPassword;
    int marks[];

    //copy constructor
    Student(Student s1){
        marks=new int[2];
        this.name=s1.name;
        this.roll= s1.roll;
        this.marks=s1.marks;
    }
    Student(){
        marks=new int[2];

    }
    Student(String name){
        marks=new int[2];
        this.name=name;
    }
    Student(int roll){
        marks=new int[2];
        this.roll=roll;
    }
}
