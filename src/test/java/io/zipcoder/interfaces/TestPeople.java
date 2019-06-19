package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestPeople {

    Instructors instructors= Instructors.getInstance();
    Instructor instructor = new Instructor();


    @Test
    public void testAdd(){
        Assert.assertTrue(instructors.add(instructor));
    }

    @Test
    public void testRemove(){
       Assert.assertTrue(instructors.add(instructor));
       Assert.assertTrue(instructors.remove(instructor));
    }

    @Test
    public void testFindById(){
        Instructor person2 = new Instructor(38L);
        Instructor person3 = new Instructor(52L);
        Instructor person4 = new Instructor(12L);

        instructors.add(person2);
        instructors.add(person3);
        instructors.add(person4);

        Person expected = person3;
        Person actual = instructors.findById(52L);

        Assert.assertEquals(expected, actual);
    }
}
