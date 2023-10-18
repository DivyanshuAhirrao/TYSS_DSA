package dsaProgram;

public class DecimalToOctal {
    public static void main(String[] args) {
        int num = 78;
        int[] oct = new int[100];
        int i =0;

        int div = 8;
        while (num !=0){
            oct[i] = num%8;
            num = num/8;
            i++;
        }
        for (int j=i-1;j>=0;j--){
            System.out.print(oct[j]);
        }

    }
}
