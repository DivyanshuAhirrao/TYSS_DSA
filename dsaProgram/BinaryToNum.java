package dsaProgram;

public class BinaryToNum
{
    public static void main(String[] args) {
       int bin = 101100001;
       int pow =2, decimaln=0;
       long rem;

       while (bin !=0){
           decimaln = bin%10*pow;
       }

        System.out.println(decimaln);
    }
}
