
import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem {

    public static void main(String[] args) {

        // create the Objects  for School 

        School school = new School();

        // Create Objects for Student 

        Student student1 = new Student(" Sanaa" , " Siaha" , "Ekra ", 20 , "Arts" , 3.5);
        Student student2 = new Student( " Marianne", "Michelle", " Tchomepi", 23, "Human Resources", 3.6);
        Student student3 = new Student ( " Franck" , "Olivier", "Poufon", 27 , " Engeneering", 3.5 );
        Student student4 = new Student ( " Herman" , " Tom ", " Ndjandjui", 26 , " Math", 3.3 );
        Student student5 = new Student ( " Rose " , " Rosalie", "Ndjandjui", 24 , " Science", 3.5 );

        // Create Object for Teacher


        Teacher teacher1 = new Teacher(" Eric ", "Amon ", "Ekra " , 38 , " Computer Science", "Software Engeneering");
        Teacher teacher2 = new Teacher(" Khaled  ", " Sylvain ", "Ngoussi " , 35 , " Math ", " Mathematics");
        Teacher teacher3 = new Teacher(" Sylvie ", " Emma ", " Franks " , 38 , " Business ", " Economics");
        Teacher teacher4 = new Teacher(" Mariam ", " Mireille  ", " Parks " , 39 , "Litterature", " Arts");
        Teacher teacher5 = new Teacher("  Lucy ", " Amanda ", " Lukes " , 41 , " Law ", " Law ");


        
        

     student4.Enroll("Math");


     student1.dropCourse("Law");

     //Create the List of Students.

     List <Student> student = new  ArrayList<Student>();

     student.add(student1);
     student.add(student2);
     student.add(student3);
     student.add(student4);
     student.add(student5);

     for (Student st : student) {
        System.out.printf("%-15s %-15s %-10s %-7.2f%n", st.getfirstName(), st.getlastName(), st.getmajor(), st.getgpa());
    }



     // Create the List of teachers

     List <Teacher> teacher = new ArrayList<Teacher>();
     teacher.add(teacher1);
     teacher.add(teacher2);
     teacher.add(teacher3);
     teacher.add(teacher4);
     teacher.add(teacher5);

     for (Teacher tch : teacher) {
        System.out.printf("%-15s %-15s %-15s %-15s%n ", tch.getfirstName(),  tch.getlastName() , tch.getsubject() , tch.getqualification());
    }
    








     
    


       
        
        


        


    
        
        
        






       




        


    }

}
