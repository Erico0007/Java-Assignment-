
import java.util.ArrayList;
import java.util.List;

public class School {


     // Reference to refer to list of Sutdents and Teachers 

    private List <Student> students;
    private List <Teacher> teachers;


    // Constructor of this class


    public School () {

        students = new ArrayList<>();
        teachers = new ArrayList<>();

    }

// Method to add a  Student
    public void addStudents( Student student){
       students.add(student);
    }

    // Method to add a teacher

    public void addteachers (Teacher teacher){
       teachers.add(teacher);
    }

    // Method to List the Students 

    public void listStudents() {
        for (Student st : students) {
            System.out.println(st.getfirstName() + " " + st.getlastName() + " " + st.getmajor() + " " + st.getgpa());
        }
    }
    
    public void listTeachers() {
        for (Teacher tch : teachers) {
            System.out.println(tch.getfirstName() + " " + tch.getlastName() + " " + tch.getsubject() + " " + tch.getqualification());
        }
    }
    


}
