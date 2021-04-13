
package lab7;
 
import java.util.*;

public class TestCourse {
    public static void output(int x, Course course){
     ArrayList<String> name_student = course.getStudents();
        int NoS = course.getNumberOfStudents();
        
        System.out.println(String.format("Number of Students in Course %d: %d", x, NoS));
        for(int i = 0; i < NoS; i++){
          if(i != NoS-1) {
            System.out.print(name_student.get(i) + ", ");
          }
          else {
            System.out.print(name_student.get(i) + "\n");
          }
        }
    }
    public static void main(String[] args) {
        Course course1 = new Course("course1");
        Course course2 = new Course("course2");
        
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        
        //PRINT C1:Name; C2
        output(1, course1);
        System.out.println(String.format("Number of students in Course 2: %d \n", course2.getNumberOfStudents()));
        
        //PRINT C1:Name
        output(1, course1);
        System.out.println(" ");
        
        //PRINT C2:Name
        output(2, course2);
        System.out.println(" ");
        
        //PRINT Drop:PJ(C1); C1:Name
        System.out.println("Drop students : Peter Jones from course 1");
        course1.dropStudent("Peter Jones"); 
        output(1, course1);
        System.out.println(" ");
    }
    
}
