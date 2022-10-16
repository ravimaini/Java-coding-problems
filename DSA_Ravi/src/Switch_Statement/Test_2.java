package Switch_Statement;

public class Test_2 {
    public static void main(String[] args) {
        // Output will be 120 because break statement is missing in all cases

        int a = 5;
        int x = 10;
        // x is 10
        switch(x) {
            // inside the case 1 which is not matched but break statement is missing it will execute the bode of case 1
            case 10:
                // a= 10
                a *= 2;
                //  inside the case 2
            case 20:
                // a=30
                a *= 3;
                // inside the case 3
            case 30:
                // a value is 140
                a *= 4;
        }
        // printing the value of the A on the console
        System.out.println(a);
    }
}
