package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testINheritance(){
        Instructor instructor = new Instructor();

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor();
        Student student = new Student();

        Double expected = 5.0;
        instructor.teach(student, expected);

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void testTotalStudyTime(){
        Instructor instructor = new Instructor();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
         Learner[] learners = new Learner[] {student1, student2, student3};

        instructor.lecture(learners, 4.5);
        Double expected = 1.5;
        Double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual);


    }
}
