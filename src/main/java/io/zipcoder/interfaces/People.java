package io.zipcoder.interfaces;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class People<E extends Person> implements Iterable{
    ArrayList<E> personList = new ArrayList<E>();

    public boolean add(E newPerson){
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

    public boolean contains(E person){
        for(Person findPerson:personList){
            if(findPerson.equals(person)){

                return true;
            }
        }
        return false;
    }

    public boolean remove(E person){
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

    public abstract E[] toArray();



    public Iterator iterator(){
        return personList.iterator();
    }

}
