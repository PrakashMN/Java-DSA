// This file contains basic OOPS concept like classes and Objects
public class Basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();//created a Pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        bankAcount b1 = new bankAcount();
        b1.userName="Prakash";
        b1.setpassword("abcdftg");
        
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class bankAcount{
    public String userName;
    private String  password;
    public void setpassword(String pass){
        password=pass;
    }
}

class Student{
    String name;
    int age;
    float percentage;


    void calcPercentage(int phy ,int chem,int math){
        percentage = (phy+chem+math)/3;
    }
}

class book{
    String cover;
    int pages;

    void setColour(String newColour){
        cover = newColour;
    }

    void setPages(int NoPages){
        pages = NoPages;
    }
}