package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void implementationTest() {
        Student student = new Student();


        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student();

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        double increase = 6L;
        Student student = new Student( 0L);
        Double expected = student.getTotalStudyTime() + increase;
        student.learn(6L);

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
}
