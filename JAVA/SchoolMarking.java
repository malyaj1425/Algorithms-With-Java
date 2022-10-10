import java.util.Scanner;
class Exam{
    private int sub1;
    private int sub2;
    private int sub3;
    private int tot;
    private int per;
    private char grade;

    public void InputMarks(){

    }
    public void Calculate(){

    }
    public void DisplayResult(){
        
    }


}
class Student{
    private int Rollno;
    private String Name;
    private String Course;
    private int Sem;
    // private char gender;
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll");
        Rollno=sc.nextInt();
        System.out.println("Enter Name");
        Name=sc.nextLine();
        System.out.println("Enter Course");
        Course=sc.nextLine();
        System.out.println("Enter Semester no.");
        Sem=sc.nextInt();
        // System.out.println("Enter Gender");
        // gender=sc.next().charAt(0);
        System.out.println();

    }
    public void Display(){
        System.out.println("Name: "+Name+" RollNo: "+Rollno+" Course: "+Course+" Semeseter: "+Sem);
    }

}

public class SchoolMarking {
    public static void main(String[] args) {
        
    }
}
