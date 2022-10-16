package Switch_Statement;

public class Test_1{
    public static void main(String[] args) {
        int x = 2;


     //   output will  x is equal to 2
      //   control goes inside matching case and prints “x is equal to 2” on to the console.
       // After that break; statement takes the control out of the switch- case block
        switch (x) {
            // default block will not execute because case 2 matched
            default:
                System.out.println("Still no idea what x is");
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to 3");
                break;
        }

}
}
