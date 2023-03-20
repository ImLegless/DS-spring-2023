package Test;

public class Test{
    public static void main(String[] args){
        double f = 32.0;
        toCelsius(f);
    }
    public static double toCelsius(double f){
        double offset = 32.0;
        double arr[] = {f,offset};
        return 9.0/5.0 * subtract(arr);
    }
    private static double subtract(double[] arr) {
        return arr[0] - arr[1];
    }
}