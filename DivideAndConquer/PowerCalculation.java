package DivideAndConquer;

public class PowerCalculation {
    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        long half = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return half * half;
        } else {
            return half * half * base;
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        long result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}

