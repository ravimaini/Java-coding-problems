// package name
package Practice_Questions;
// This program ask user to enter three numbers
//  Average Function Calculate the the average of the three numbers
// import name
import java.util.Scanner;

// Class name
public class AverageNumber {
    // Declaring the four integer with names a,b,c,average
    int a,b,c,average;
    // Scanner class object used to take a input from console
    Scanner input=new Scanner(System.in);

    public void averageNumber(){
        // print message
        System.out.println("--------------------------------------");
        System.out.println("Please enter the first number");
        // user enter the first number on console
    a=input.nextInt();
        //print message
        System.out.println("Please enter the second number");
        // user enter the second number on console
    b=input.nextInt();
        //print message

        System.out.println("Please enter the third number");
        // user enter the third number on console
    c=input.nextInt();
    // calculating the average of the three numbers which user enters
    average=((a+b+c)/3);
    // print message on console
        System.out.println("Average of the three numbers you entered = "+average);
    }

    // main function
    public static void main(String[] args) {
    // creating a object of the class
        AverageNumber object= new AverageNumber();
        // calling the method averageNumber method using object
        object.averageNumber();

    }
}
