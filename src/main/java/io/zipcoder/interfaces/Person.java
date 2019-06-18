package io.zipcoder.interfaces;

public class Person {
    final private Long id;
    private String name;

    public Person(){
        id = 0l;
        name = "";
    }

    public Person(Long id){
        this.id = id;
    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
