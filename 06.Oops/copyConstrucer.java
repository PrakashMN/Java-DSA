public class copyConstrucer {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="Prakash";
        s1.roll = 80;
        s1.password = "qwerty";
        Student s2 = new Student(s1);
        s1.marks[0]= 67;
        s1.marks[1]= 89;
        s1.marks[2] = 58;
    }
}


class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;

    }

    Student(){
        marks = new int[3];
        System.out.println("Constructer is called");
    }

    Student(int roll){
        marks = new int[3];
        this.roll=roll;
    }
    Student(String name){
        marks = new int[3];
        this.name=name;
    }
}
