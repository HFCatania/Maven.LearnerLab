package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    DOLIO(new Instructor(25L, "Dolio"), 0.0),
    KRIS(new Instructor(26L, "Kris"), 0.0),
    WILHEM(new Instructor(27L, "Wilhem"),0.0),
    FROILAN(new Instructor(28L, "Froilan"), 0.0);

    public void setTimeWorked(Double timeWorked) {
        this.timeWorked = timeWorked;
    }

    private final Instructor instructor;

    private Double timeWorked;
    Educator(Instructor instructor, Double timeWorked){
        this. instructor = instructor;
        this.timeWorked = timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learners, double numberOfHours) {

    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Double getTimeWorked() {
        return timeWorked;
    }
}
