package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class StudentRecordTest {

    StudentRecord obj;

    @Before
    public void setup(){
        System.out.println("Before");
        obj = new StudentRecord();
    }

    @After
    public void teardown(){
        System.out.println("After");
        obj = null;
    }


    @Test
    public void  givenArrayShouldReturnAverage (){

        //Arrange
        int inputarray[] = {50,50,50,50};
        //Act

        //Assert
        assertEquals(50,obj.averagemarks(inputarray));
        assertNotEquals(100,obj.averagemarks(inputarray));

    }

    @Test
    public void  givenArrayShouldReturnLowestMarks (){

        //Arrange
        int inputArray[]={23,87,12,39};

        //Act

        //Assert
        assertEquals(12,obj.lowestmarks(inputArray));
        assertNotEquals(23,obj.lowestmarks(inputArray));

    }

    @Test
    public void  givenArrayShouldReturnHIghestMarks (){

        //Arrange
        int inputArray[]={23,87,12,39};

        //Act

        //Assert
        assertEquals(87,obj.highestmarks(inputArray));
        assertNotEquals(39,obj.highestmarks(inputArray));

    }


}