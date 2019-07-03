package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPallindromeReverseStringTest {

    CheckPallindromeReverseString obj;
    @Before
    public void setup(){

        obj = new CheckPallindromeReverseString();
    }

    @After
    public void teardown(){

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

    @Test
    public void  givenNegativeShouldReturnNull (){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(-534);


        //Assert
        assertNotEquals(null,result);

    }

    @Test
    public void  givenalphanumerichouldReturnValue (){

        //Arrange

        //Act
        String result =  obj.checkpallindrome(0);


        //Assert
        assertNotEquals(0,result);

    }

}