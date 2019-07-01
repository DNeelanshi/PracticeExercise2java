package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPallindromeReverseStringTest {

    CheckPallindromeReverseString obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new CheckPallindromeReverseString();
    }

    @After
    public void teardown(){
        System.out.println("After");
        obj = null;
    }


    @Test
    public void  givenNumberShouldReturnPallindromeandReverse (){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(1221);


        //Assert
        assertEquals("Reversed number is:1221 and it is pallindrome",result);

    }

    @Test
    public void  givenNonPallindromeNumberShouldReturnNotPallindrome (){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(19691961);


        //Assert
        assertEquals("Reversed number is:16919691 and it is not pallindrome",result);

    }




}