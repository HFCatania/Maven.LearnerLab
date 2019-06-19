package io.zipcoder.interfaces;

public final class Students extends People {
    private static Students instance = new Students();

    private Students(){
        super.add(new Student(129L, "Larry"));
        super.add(new Student(130L, "Moe"));
        super.add(new Student(131L, "Curly"));
        super.add(new Student(132L, "Groucho"));
        super.add(new Student(666L, "Satan"));
        super.add(new Student(134L, "Harpo"));
}

    public static Students getInstance() {
        if(instance == null){
            instance = new Students();
        }
        return Students.instance;
    }


}
