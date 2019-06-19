package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private static Instructors instance = new Instructors();

    private Instructors(){
        super.add(new Instructor(25L, "Dolio"));
        super.add(new Instructor(26L, "Kris"));
        super.add(new Instructor(27L, "Wilhem"));
        super.add(new Instructor(28L, "Froilan"));
    }

    public static Instructors getInstance() {
        if(instance == null){
            instance = new Instructors();
        }
        return Instructors.instance;
    }

    public Instructor[] toArray(){
        Instructor[]instructors = new Instructor[super.personList.size()];
        return personList.toArray(instructors);
    }


}
