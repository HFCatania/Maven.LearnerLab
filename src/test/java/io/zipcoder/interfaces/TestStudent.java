package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void implementationTest() {
        Student student = new Student();


        Assert.assertTrue(student instanceof LearnerInterface);
    }

    @Test
    public void testInheritance(){
        Student student = new Student();

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        double increase = 6L;
        Student student = new Student((long) 0);
        Double expected = student.getTotalStudyTime() + increase;
        student.learn(6L);

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
}
