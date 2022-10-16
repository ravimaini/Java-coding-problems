package Switch_Statement;

public class Test_5 {
    public static void main(String[] args) {
        String fruit = "args";
        // output will be ANY FRUIT WILL DO BECAUSE NONE OF CASE MATCHED WITH (args)
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
    }
}
