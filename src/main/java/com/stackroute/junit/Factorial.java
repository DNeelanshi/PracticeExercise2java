package com.stackroute.junit;

public class Factorial {

    public static long longFactorial(long MAX_VALUE)
    {
        //taking number and using loop to find factorial
        if(MAX_VALUE <0){
            return 0;
        }

        long fact=1;
        for(int i=1;i<=MAX_VALUE;i++)
        {
            fact=fact*i;
        }
        return fact; //returning the factorial value
    }
}
