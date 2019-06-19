package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test1(){
        Student testStudent = (Student) Students.getInstance().findById(129L);

        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }

    @Test
    public void test2(){
        Student testStudent = (Student) Students.getInstance().findById(130L);

        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }

    @Test
    public void test3(){
        Student testStudent = (Student) Students.getInstance().findById(131L);

        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }

    @Test
    public void test4(){
        Student testStudent = (Student) Students.getInstance().findById(132L);

        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }

    @Test
    public void test5(){
        Student testStudent = (Student) Students.getInstance().findById(666L);

        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }

    @Test
    public void test6(){
        Student testStudent = (Student) Students.getInstance().findById(134L);

        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }
}
