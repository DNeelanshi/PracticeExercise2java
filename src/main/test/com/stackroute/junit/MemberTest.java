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

        obj = new Member();
        obj2 = obj.new MemberVariable();

    }

    @After
    public void teardown(){

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

    @Test
    public void  givenzerosalaryandageShouldreturnerror (){
        //Arrange
        String [] expectedValue = null;

        //Act
        String [] actualValue = obj2.isMember("Harry Potter",0,0);
        //Assert
        assertArrayEquals(expectedValue, actualValue);


    }

    @Test
    public void  givenwronginputsShouldreturnNull (){
        //Arrange
        String [] expectedValue = null;

        //Act
        String [] actualValue = obj2.isMember(" ",-56,-89);
        //Assert
        assertArrayEquals(expectedValue, actualValue);


    }

}