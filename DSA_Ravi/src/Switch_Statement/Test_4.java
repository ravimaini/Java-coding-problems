package Switch_Statement;

public class Test_4 {
    public static void main(String[] args) {
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
                // byte value excceds compile time error
          //  case 200:
              //  System.out.println("var is 200");
            //    break;
            default:
                System.out.println("In default");
        }
    }
}
