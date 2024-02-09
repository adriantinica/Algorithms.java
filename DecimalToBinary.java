public class DecimalToBinary {

    public static void main(String[] args) {
        int n = 13;
        decimaltoBinaryTrasnform(n);
    }

    public static void decimaltoBinaryTrasnform(int n){

        int[] binaryNum = new int[1000];

        int i=0;
        while (n>0) {
            System.out.println(n);
            binaryNum[i] = n%2;
            n= n/2;
            i++;
            
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
        
    }
}