public class Homework1 {

    /**
     * Implement factorial with loop
     */
    public static int iterativeFactorial(int x){
        int i, fact = 1;
        for (i = 1; i < x; i++){
            fact = fact*i;
        }
    } /* End iterativeFactorial */

    /**
     * Implement factorial with recursion
     */
    public static int recursiveFactorial(int x){
        if (x == 0){
            return 1;
        }
        else{
            return x*recursiveFactorial(x-1);
        }
    } /* End recursiveFactorial */

    /**
     * Implement isEven
     */
    public static boolean isEven(int x){
        if(x % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    } /* End isEven */

    /**
     * Implement isOdd
     */
    public static boolean isOdd(int x){
        if (x % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    } /* End isOdd */

    /**
     * Implement isPalindrome (use "reverse method")
     */
    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    } /* End isPalindrome (referenced https://stackoverflow.com/questions/4138827/check-string-for-palindrome) */

} /* End Homework1 */
