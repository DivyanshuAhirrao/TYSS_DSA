package dsaProgram;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal Number !!");

        int num = sc.nextInt();

        System.out.println("Select the Choice : ");
        System.out.println("-------------------------");

        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to HexaDecimal");
        System.out.println("4. Binary to Decimal");
        System.out.println("5. Binary to Octal");
        System.out.println("6. Binary to HexaDecimal");
        System.out.println("7. Octal to Decimal");
        System.out.println("8. Octal to Binary");
        System.out.println("9. Octal to HexaDecimal");
        System.out.println("10. HexaDecimal to Decimal");
        System.out.println("11. HexaDecimal to Binary");
        System.out.println("12. HexaDecimal to Octal");

        System.out.println();

        int choice = sc.nextInt();

        int temp = num;

        String res1 = "";
        int res2 = 0;
        int res3 = 0;
        int[] oct = new int[100];
        int i =0;
        int div = 8;

        while (num!=0){
            if (choice==1) {
                res1 = num % 2 + res1;
                System.out.println(res1);
                num /= 2;
            }
            else if (choice == 2) {
                res2 = 12;
                oct[i] = num%8;
                num = num/8;
                i++;
            }
            else if (choice==3) {
                res3 = 22;
            }
            else {
                System.out.println("Invalid Choice ! Try Again !!");
            }
        }

        switch (choice){
            case 1 : {
                System.out.println(temp+"-->"+res1);
            }
            break;
            case 2 : {
                for (int j=i-1;j>=0;j--){
                    System.out.print(oct[j]);
                }
            }
            break;
            case 3 : {
                System.out.println(res3);
            }
        }
    }

    public static int anyToDecimal(int n1, int n2){
        int dec= 0;
        int pow = 1;

        while (n1 != 0){
            dec += n1%10 *pow;
            n1 /= 10;
            pow *= n2;
        }
        return dec;
    }

    public static int decimalToAny(int n1, int n2){
        int temp = n1;
        int res = 0;
        int i = 1;
        while (temp != 0){
            res += temp*n2*i;
            temp /= n2;
            i *= n2;
        }
        return res;
    }



}
