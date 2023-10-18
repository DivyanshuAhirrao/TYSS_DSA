package dsaProgram;

public class Pattern {

    public static void main(String[] args) {
        pattern(8);
    }

    private static void pattern(int n){
        for (int i=1;i<=n;i++) {
            int a = 1; char ch = (char) (96+n);
            for (int j=1;j<=n;j++){
                if (i%2==1){
                    if (j==1 || j==n || i==1 || i==n){
                        System.out.print(a);
                    }
                    else {
                        System.out.print(" ");
                    }
                    a++;
                }
                else {
                    if (j==1 || j==n || i==1 || i==n){
                        System.out.print(ch);
                    }
                    else System.out.print(" ");
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
