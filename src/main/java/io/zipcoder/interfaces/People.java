package io.zipcoder.interfaces;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable{
    ArrayList<Person> personList = new ArrayList<Person>();

    public boolean add(Person newPerson){
        personList.add(newPerson);
        return true;
    }

    public Person findById(Long id){
        for(Person person:personList){
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        for(Person findPerson:personList){
            if(findPerson.equals(person)){

                return true;
            }
        }
        return false;
    }

    public boolean remove(Person person){
        for(Person removePerson:personList){
            if(removePerson.equals(person)){
                personList.remove(person);
                return true;
            }
        }
        return false;
    }

    public boolean remove(Long id){
        for (Person removePerson:personList){
            if(removePerson.getId().equals(id)){
                personList.remove(removePerson);
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(){
        if(personList.isEmpty()){
            return false;
        }
        personList.clear();
        return true;
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] personArray = personList.toArray(new Person[personList.size()]);
        return personArray;
    }

    public Iterator iterator(){
        return personList.iterator();
    }

}
