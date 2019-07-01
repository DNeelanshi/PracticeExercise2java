package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial obj;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new Factorial();
    }

    @After
    public void teardown(){
        System.out.println("After");
        obj = null;
    }


    @Test
    public void  givenNumberShouldFactorial (){

        //Arrange

        //Act

        //Assert
        assertEquals(120,obj.longFactorial(5));
        assertEquals(2,obj.longFactorial(2));
        assertEquals(1,obj.longFactorial( 1));
        assertEquals(479001600,obj.longFactorial(12));


    }

}
