public class SwapValues {

    public static void main(String[] args) {

       int  a=5, b=9;
       System.out.println("Initial value of b is "+ b +"/ Initial value of a is "+ a +";");
       //swapValuesUsingThirdVariable(a, b);
       swapValuesUsingOperators(a, b);
        
    }

    public static void swapValuesUsingThirdVariable(int a, int b){

        int temp;

        temp = a;
        a=b;
        b=temp;

        System.out.println("Value of a is "+ a 
                                +"\nValue of b is "+b);
        


    }

    public static void swapValuesUsingOperators(int a, int b){

        a=(b+a)-(b=a);
       

        System.out.println("Value of a is "+ a 
                                +"\nValue of b is "+b);
        


    }
}