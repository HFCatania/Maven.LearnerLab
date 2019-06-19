package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(Educator.KRIS.getInstructor() instanceof Person);
    }

    @Test
    public void testTeach(){
        Student schoolJERK = new Student(31513L, "Timbo", 5.0);

        Double expected = 5.0;
        Educator.FROILAN.teach(schoolJERK, expected);

        Double actual = schoolJERK.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTotalStudyTime(){


        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Learner[] learners = new Learner[] {student1, student2, student3};

        Educator.FROILAN.lecture(learners, 4.5);
        Double expected = 1.5;
        Double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual);


    }

}
