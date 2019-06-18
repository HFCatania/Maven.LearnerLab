package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        Long expectedId = 51L;
        String expectedName = "jimothiy";

        Person person = new Person(expectedId,expectedName);

        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());

    }


    @Test
    public void setName() {
        Person person = new Person();
        String expected = "jimothy";

        person.setName(expected);
        String actual = person.getName();

        Assert.assertEquals(expected, actual);

    }



}
