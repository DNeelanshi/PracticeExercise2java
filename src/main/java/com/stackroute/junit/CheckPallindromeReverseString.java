package com.stackroute.junit;

public class CheckPallindromeReverseString {

    //REverse the string first

    public String checkpallindrome( int num){

        int reversed =0 , temp;

        temp = num;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
//    CHecking if reversed string is pallindrome or not
        if(temp == reversed){
            return ("Reversed number is:"+reversed+" and it is pallindrome");
        }else{
            return ("Reversed number is:"+reversed+" and it is not pallindrome");
        }

    }
}
