package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static Students instance = new Students();

    private Students(){
        add(new Student(129L, "Larry", 0.0));
        add(new Student(130L, "Moe",0.0));
        add(new Student(131L, "Curly",0.0));
        add(new Student(132L, "Groucho", 0.0));
        add(new Student(666L, "Satan", 0.0));
        add(new Student(134L, "Harpo", 0.0));
}

    public static Students getInstance() {
//        if(instance == null){
//            instance = new Students();
//        }
        return instance;
    }

    public Student[] toArray(){
        Student[] students = new Student[super.personList.size()];
        return personList.toArray(students);
    }


}
