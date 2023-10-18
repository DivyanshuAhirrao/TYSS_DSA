package dsaProgram;

public class NumToBinary {
    public static void main(String[] args) throws InterruptedException {
        int num = 4;
        int temp = num;

        String res = "";

        while (num!=0){
            res = num%2+res;
//            Thread.sleep(2000);
//            System.out.println(res);
            num/=2;
        }

        System.out.println(temp+"-->"+res);

    }
}
