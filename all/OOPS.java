public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        // BankAccount bnk= new BankAccount();
        // bnk.name="Preeti Yadav";
        // bnk.setPassword("123456");
        // System.out.println(bnk.name);
    }
    
}
// class BankAccount{
//     public String name;
//     // private String password;

//     void setPassword(String pwd){
//         // password= pwd;
//     }
// }
class Pen{
    private String color;
    private int tip;

    //setters
    void setColor(String newColor){
        color= newColor;
    }
    void setTip(int newtip){
        tip= newtip;
    }

    //getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
