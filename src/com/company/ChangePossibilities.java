package com.company;

public class ChangePossibilities {

    public static void main(String[] args) {
        int array[] = {1, 2, 3};
        int arrayLength = array.length;
        System.out.println( count(array, arrayLength, 4));
    }

    static int count( int array[], int arrayLength, int number )
    {
        if (number == 0) return 1;
        if (number < 0) return 0;
        if (arrayLength <=0 && number >= 1) return 0;
        return count( array, arrayLength - 1, number ) +
                count( array, arrayLength, number-array[arrayLength-1] );
    }
}
