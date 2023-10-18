package dsaProgram;

public class HollowTriangle {
    static int Staticint;
    int nonStatic;

    static {
        System.out.println("Hello I am Static Block !!");
        useVar();
    }
    static HollowTriangle ht = new HollowTriangle();

    public static void main(String[] args) {
        hallowPatrn(7);
        switchCheck();
    }
    static void useVar(){
        System.out.println(Staticint);
    }

    private static void switchCheck() {
        String str = "true";
        boolean flag = true;
        float f1 = 45.5f;
        double d = 45.2;
        long l1 = 45;

        switch ("true"){
            case "true" : {
                System.out.println("Correct");
            }
            break;
            case "false" : {
                System.out.println("Incorrect");
            }
            break;
            default:
                System.out.println("I am from Defualt");
        }
    }

    private static void hallowPatrn(int i) {

        for (int a=1;a<=i;a++) {
            for (int k = 1; k <= a; k++) {
                if (k == 1 || k == a || a==i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}