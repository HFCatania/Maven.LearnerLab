package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static Students instance = new Students();

    private Students(){
        add(new Student(129L, "Larry"));
        add(new Student(130L, "Moe"));
        add(new Student(131L, "Curly"));
        add(new Student(132L, "Groucho"));
        add(new Student(666L, "Satan"));
        add(new Student(134L, "Harpo"));
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
