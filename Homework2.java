package edu.psu.cmpsc221;

import java.util.ArrayList;
import java.util.function.Function;


public class Homework2 {
    public static void main(String[] args) {
        Function<Integer, Integer> function = new CalculateSuccessor();
        Integer[] integerArray = {1, 3, 4, 2, 5};
        PrintArray(map(function, integerArray)); // map returns {2,4,5,3,6}

        Function<Integer, String> anotherFunction = new CalculateLength();
        String[] stringArray = {"Java", "C++", "Smalltalk"};
        PrintArray(map(anotherFunction, stringArray)); // map returns {4, 3, 9}

        Function<Double, Double> tripleFunction = new CalculateTriple();
        Double[] doubleArray = {2.0, 4.0, 5.0, 1.0};
        PrintArray(map(tripleFunction, doubleArray)); // map returns {6.0, 12.0, 15.0, 3.0}
    } /* End psvm */

    private static <R> void PrintArray(R[] value){
        for (R element : value){
            System.out.print(element + " ");
        } /* End for loop */
    } /* End PrintArray*/


    public static <R,D> R[] map(Function<R,D> function, D[] array){
        ArrayList<R> newList = new ArrayList<>();
        for (int i = 0; i < array.length; ++i){
            newList.add((function.apply(array[i])));
        } /* End for loop */
        R[] newArray = (R[]) newList.toArray();
        return newArray;
    } /* End map function */

} /* End Homework2 (code referenced from stack overflow) */
