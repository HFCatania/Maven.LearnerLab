package io.zipcoder.interfaces;

public final class Students extends People {
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


}
