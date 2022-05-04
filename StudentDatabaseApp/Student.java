package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private  int tuituionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name:  ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name:  ");
        this.lastName = in.nextLine();

        System.out.print("1- Freshment\n2- Sophmore\n3- Juniot\n4- Senior\nEnter student class level:  ");
        this.gradeYear = in.nextInt();
        setStudentId();




    }
    private void setStudentId(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuituionBalance = tuituionBalance + costOfCourse;

        }else {

                break;
            }

        }while (1 != 0);


    }
    public void viewBalance(){
        System.out.println("Your balance is $" + tuituionBalance);
    }
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment :$");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuituionBalance = tuituionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    public String toString(){
        return "Name :" + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: "+ courses +
                "\nBalance: $" + tuituionBalance;
    }
}
