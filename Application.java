public class Application {
    public static int iterativeFactorial(int n){
        if (n < 0) throw new IllegalArgumentException("Negative value passed in");

        int accumulator = 1;

        for (int i = 1; i <= n; ++i){
            accumulator *= i;
        } /* end for */

        return accumulator;
    } /* end iterativeFactorial */
} /* end Application */
