package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial obj;
    @Before
    public void setup(){

        obj = new Factorial();
    }

    @After
    public void teardown(){

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
    @Test
    public void  givenLOngNUmberShouldFactorial (){

        //Arrange

        //Act

        //Assert
        assertEquals(0,obj.longFactorial(400));

    }
    @Test
    public void  givenNegativeNUmberShouldFactorial (){

        //Arrange

        //Act

        //Assert
        assertEquals(0,obj.longFactorial(-4));


    }


}
