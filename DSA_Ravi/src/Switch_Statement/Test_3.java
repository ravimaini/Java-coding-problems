package Switch_Statement;

public class Test_3 {

        public static void main(String[] args) {
            int score = 60;
            switch (score) {
                default:
                    System.out.println("Not a valid score");
                    // syntax error
               // case score < 70:
                    System.out.println("Failed");
                    break;
                    //syntax error
              //  case score >= 70:
                  //  System.out.println("Passed");
                   // break;
            }
        }
}
