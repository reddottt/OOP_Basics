package Recursive;

public class RecursiveBisection {

    public static void main(String[] args) {
        System.out.println(recursiveBisection(0, 10));
    }

    public static double equation(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public static double recursiveBisection(double left, double right) {
        if (right - left <= 0.001) {
            return left;
        }else{
            double x = left + (right - left) / 2;

            if (equation(left) * equation(right) > 0) {
                return recursiveBisection(x, right);
            }else {
                return recursiveBisection(left, x);
            }
        }
    }
}
