package com.stackroute.junit;

public class PowerofFour {

    //checking if entered number is power of 4 or not.

    public static Boolean checkpoeroffour(int num) {

        if(num<1){
            return false;
        }
        boolean result=true;
        while(num!=1){
            if(num%4 !=0){
                result=false;
                break;
            }
            num/=4;
        }

        return result; //boolean value is returned
    }


}
