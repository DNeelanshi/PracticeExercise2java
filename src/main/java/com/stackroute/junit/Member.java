package com.stackroute.junit;

public class Member {

    //Making class with the inner class isMember
    class MemberVariable{

        public String[] isMember (String name, int age, double salary) {
            if((age>1)&&salary>1){

                String arr[] = {name.trim(), String.valueOf(age), String.valueOf(salary)};
                if(arr.length>=1){
                    return arr; //returning string of array
                }else{
                    return null; //return null if empty
                }
            }else {
                return null;
            }


        }

    }

}


