package Practice_Questions;
// This program ask user please Enter the number to
// print all the odd number bw 1- that number user entered

import java.util.Scanner;

// declaring the class SumOfN
public class SumOfN {
    // Declaring the a integer variable name Number
    int number;
    // Scanner class object used to take a input from console
    Scanner input=new Scanner(System.in);
   // declaring the method name TakeUserInput with void return type
    public void TakeUserInput(){
        // print message
        System.out.println("--------------------------------------------------");
        System.out.println("Enter the number you want to print odd number bw 1-n");
        // user input
      number= input.nextInt();
      // for loop
      for (int i=1; i<=number; i++){
          // logic to check odd number
          if(i%2!=0){
              System.out.println(i);
          }

      }
    }
    // main method
    public static void main(String[] args) {
        // creating a object of the class
        SumOfN object= new SumOfN();
        // calling the method TakeUserInput method using object
        object.TakeUserInput();
    }

}
