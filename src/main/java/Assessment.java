public class Assessment {

    /** Factorial completed */
    public static int factorial(int factorial) {
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        return result;
    }
    /** quotient completed */
    public static double quotient(int num1, int num2) {
        return (double) num1 / num2;
    }
    public static double quotient(double num1, double num2) {
        return num1 / num2;
    }



    public static void main(String[] args) {
        System.out.println("hello");


    }
}
