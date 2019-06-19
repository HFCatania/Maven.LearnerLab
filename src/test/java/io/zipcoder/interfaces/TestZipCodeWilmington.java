package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        ZipCodeWilmington zipCodeWilmingtonTest = ZipCodeWilmington.getInstance();
        zipCodeWilmingtonTest.hostLecture(25L, 3.0);

        Map<Student, Double> testMap = zipCodeWilmingtonTest.getStudyMap();

        Students students = Students.getInstance();

        Student student5 = (Student) students.findById(666L);

        Double actual = testMap.get(student5);

        Assert.assertEquals(0.5, actual, 0);

    }
}
