package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.jnlp.PersistenceService;

public class TestPeople {

    People people = new People();
    Person person = new Person();


    @Test
    public void testAdd(){
        Assert.assertTrue(people.add(person));
    }

    @Test
    public void testRemove(){
       Assert.assertTrue(people.add(person));
       Assert.assertTrue(people.remove(person));
    }

    @Test
    public void testFindById(){
        Person person2 = new Person(38L);
        Person person3 = new Person(52L);
        Person person4 = new Person(12L);

        people.add(person2);
        people.add(person3);
        people.add(person4);

        Person expected = person3;
        Person actual = people.findById(52L);

        Assert.assertEquals(expected, actual);
    }
}
