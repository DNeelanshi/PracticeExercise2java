package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class MemberTest {

    Member obj;
    Member.MemberVariable obj2;
    @Before
    public void setup(){
        System.out.println("Before");
        obj = new Member();
        obj2 = obj.new MemberVariable();

    }

    @After
    public void teardown(){
        System.out.println("After");
        obj = null;
    }


    @Test
    public void  givenArrayValuesShouldreturnsamevalues (){
        //Arrange
        String [] expectedValue = {"Harry Potter", "30", "2500.3"};

        //Act
        String [] actualValue = obj2.isMember("Harry Potter",30,2500.3);
        //Assert
        assertArrayEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }

}