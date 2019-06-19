package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class ZipCodeWilmington {
    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington instance = new ZipCodeWilmington();


    public static ZipCodeWilmington getInstance(){
        return instance;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[]) students.personList.toArray(), numberOfHours);
    }

    public void hostLecture(Long id, Double numberOfHours){
       Person[] dumbLearners = students.toArray();
       Student[] stus = new Student[students.count()];
        for(int i = 0; i < students.count(); i++){
            stus[i] = (Student) dumbLearners[i];
        }
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture( stus, numberOfHours);
    }

    public HashMap getStudyMap(){

        HashMap<Student, Double> studyMap = new HashMap<Student, Double>();

        for (Object student:students){
            Student tempStudent = (Student) student;
            studyMap.put(tempStudent, tempStudent.getTotalStudyTime());
        }
        return studyMap;
    }
}
