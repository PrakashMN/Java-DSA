/* public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen color is : "+p1.gutColor());
        p1.setTip(5);
        p1.setTip(7);
        System.out.println("Tip Size is : "+p1.getTip());
        Student s1 = new Student();
        s1.SetName("sam");
        s1.SetAge(20);
        s1.SetAge(23);
        s1.phy(67);
        s1.phy(45);
        s1.phy(90);
        s1.phy=67;
        s1.math(64);
        s1.math(98);
        s1.chem(87);
        s1.chem(38);
        s1.calPercentage(67, 64, 87);
        System.out.println("Student Name is : "+s1.getName());
        System.out.println("Student age is : "+s1.getAge());
        System.out.println("Physics marks are : "+s1.phy);
        System.out.println("Chemistry Marks are : "+s1.chem);
        System.out.println("Maths marks are : "+s1.math);
        System.out.println("The percentage is : "+s1.calPercentage(67, 64, 87));
    }
}

class Pen{
    private String color;
    private int tip;
    void setColor(String newColor){
        color=newColor;
    }
    String gutColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    private String Name;
    protected int age;
    public int phy;
    int chem;
    int math;
    int calPercentage(int phy,int chem,int math){
        int percentage = (phy+chem+math)/3;
        return percentage;
    }
    String getName(){
        return this.Name;
    }
    void SetName(String newName){
        Name=newName;
    }
    void SetAge(int newAge){
        age=newAge;
    }
    int getAge(){
        return this.age;
    }
    void math(int mathmarks){
        math=mathmarks;

    }
    void phy(int phymarks){
        phy=phymarks;
    }
    void chem(int chemmarks){
        chem=chemmarks;
    }
} 
 */


 public class oops {
 
    public static void main(String[] args) {
        Student s1=new Student("Prakash");

        
    }
 }

 class Student{
    String name;
    int roll;
    Student(String name){

        System.out.println("constructer is called" );
    }
 }