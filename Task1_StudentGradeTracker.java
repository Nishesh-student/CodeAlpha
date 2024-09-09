package CodeAlpha;

import java.util.Scanner;

public class Task1_StudentGradeTracker {
    private double[] marks ;
    Scanner sc = new Scanner(System.in);
    Task1_StudentGradeTracker(){
        marks = new double[5];
    }

    public void enterMarks(){
        System.out.println("Enter marks of student : ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextDouble();
        }
    }
    private double average(double[] marks)
    {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum +=marks[i];
        }
        return (sum/marks.length);
    }

    private double highest(double[] marks)
    {
        double max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (max < marks[i]){
                max = marks[i];
            }
        }
        return max;
    }

    private double lowest(double[] marks)
    {
        double min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (min>marks[i]){
                min = marks[i];
            }
        }
        return min;
    }

    public void printResult(){
        System.out.println("Your result is ");
        System.out.println("Your average marks are : "+average(this.marks));
        System.out.println("Your highest marks are : "+highest(this.marks));
        System.out.println("Your lowest  marks are : "+lowest(this.marks));
    }

    public static void main(String[] args) {
        Task1_StudentGradeTracker stu1 = new Task1_StudentGradeTracker();
        Task1_StudentGradeTracker stu2 = new Task1_StudentGradeTracker();
        stu1.enterMarks();
        stu1.printResult();
        stu2.enterMarks();
        stu2.printResult();
    }

}
