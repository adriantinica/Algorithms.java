public class FindFactorialNumber {

    public static void main(String[] args) {
        int n = 5;
        System.out.print("The factorial number of "+ n + " is ");
        System.out.println(findFactorialNumber(n)+";");
    }

    public static int findFactorialNumber(int n ){

        int f = 1, j ;
        for (j = 2; j <=n; j++) {
            f *= j;
        }
        


        return f;

    }

}