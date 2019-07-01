package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerofFourTest {

    PowerofFour obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new PowerofFour();
    }

    @After
    public void teardown(){
        System.out.println("After");
        obj = null;
    }


    @Test
    public void  givenNumberShouldReturntrue (){

        //Arrange
        Boolean expectedValue =true;
        //Act

        Boolean actualValue = obj.checkpoeroffour(16);
        //Assert
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void  givenNumberShouldReturnfalse (){

        //Arrange
        Boolean expectedValue =false;
        //Act

        Boolean actualValue = obj.checkpoeroffour(44);
        //Assert
        assertEquals(expectedValue,actualValue);

    }


}