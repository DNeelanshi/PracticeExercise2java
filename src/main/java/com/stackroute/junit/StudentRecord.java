package com.stackroute.junit;

public class StudentRecord {

    public int averagemarks(int arr[])   //average marks calculation
    {
        int sum=0 ;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum/arr.length;

    }
    public int lowestmarks(int arr[])   //lowestmarks search
    {
        int minval =arr[0] ;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minval)
                minval = arr[i];
        }
        return minval;

    }
    public int highestmarks(int arr[])   //highest marks search
    {

        int maxval = arr[0] ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> maxval)
                maxval = arr[i];
        }
        return maxval;
    }
}


