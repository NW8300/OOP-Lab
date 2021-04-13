
package lab7;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;
    
    Course(String courseName){
        this.courseName = courseName;
    }
    
    String getCourseName(){
        return courseName;
    }
    
    void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }
    
    void dropStudent(String student){
        for(int i = 0; i < numberOfStudents; i++){
            if(students.get(i).equals(student)){
                students.remove(i);
                numberOfStudents--;
                break;
            }
        }
    }
    
    ArrayList<String> getStudents(){
        return students;
    }
    
    int getNumberOfStudents(){
        return numberOfStudents;
    }
}