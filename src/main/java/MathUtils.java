public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Return -1.0 for division by zero
        } else {
            return (double) a / b;
        }
    }

    // You can add more methods or functionalities as needed
}
