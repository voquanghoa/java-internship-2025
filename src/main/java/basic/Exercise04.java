package basic;

public class Exercise04 {
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public String fibonacciArray(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        StringBuffer result = new StringBuffer();
       int i=1;
        while(fibonacci(i)<n){
            result.append(fibonacci(i)).append(" ");
            i++;
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
