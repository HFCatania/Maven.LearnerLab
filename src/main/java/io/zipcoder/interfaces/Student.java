package io.zipcoder.interfaces;


public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(){
    }

    public Student(Long id){
        super(id);
    }

    public Student(Long id, String name, Double totalStudyTime){
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getStudyTime() {
        return totalStudyTime;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
