package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test1(){
        Instructor testInstructor = (Instructor) Instructors.getInstance().findById(25L);

        Assert.assertTrue(Instructors.getInstance().contains(testInstructor));
    }

    @Test
    public void test2(){
        Instructor testInstructor = (Instructor) Instructors.getInstance().findById(26L);

        Assert.assertTrue(Instructors.getInstance().contains(testInstructor));
    }

    @Test
    public void test3(){
        Instructor testInstructor = (Instructor) Instructors.getInstance().findById(27L);

        Assert.assertTrue(Instructors.getInstance().contains(testInstructor));
    }

    @Test
    public void test4(){
        Instructor testInstructor = (Instructor) Instructors.getInstance().findById(28L);

        Assert.assertTrue(Instructors.getInstance().contains(testInstructor));
    }
}
