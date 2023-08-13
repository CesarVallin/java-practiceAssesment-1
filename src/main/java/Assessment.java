import java.util.ArrayList;
import java.util.HashMap;

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
    /** minMaxSum completed */
    public static int minMaxSum(int [] param) {
        int min = param[0];
        for (int i = 0; i < param.length; i++) {
            if (param[i] < min) {
                min = param[i];
            }
        }
        int max = param[0];
        for (int i = 0; i < param.length; i++) {
            if (param[i] > max) {
                max = param[i];
            }
        }
        return min + max;
    }

    /** */
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static HashMap<String, Vehicle> createInventory(ArrayList<Vehicle> vehicles){
        HashMap<String, Vehicle> inventoryList = new HashMap<>();
        String licensePlate = "SATX";
        for(int i = 0; i < vehicles.size(); i++) {
            inventoryList.put(licensePlate + i, vehicles.get(i));
        }
        return inventoryList;
    }



    public static void main(String[] args) {
        System.out.println("hello");
        int[] minMax3 = {-1,88,3,15,31,63,-2,0};

        System.out.println(minMaxSum(minMax3));

    }
}
