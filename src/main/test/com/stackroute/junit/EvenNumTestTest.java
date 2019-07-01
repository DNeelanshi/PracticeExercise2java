package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new EvenNumTest();
    }

    @After
    public void teardown(){
        System.out.println("After");
        obj = null;
    }


    @Test
    public void  givenNumberShouldReturntrue (){

        //Arrange

        //Act
        boolean result =  obj.isEven(16);


        //Assert
        assertEquals(true,result);

    }

    @Test
    public void  givenNumberShouldReturnfalse (){

        //Arrange

        //Act
        boolean result =  obj.isEven(19);


        //Assert
        assertEquals(false,result);

    }




}