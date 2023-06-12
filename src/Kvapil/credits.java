
package Kvapil;

import java.util.ArrayList;


public class credits {
    private ArrayList<Student> listOfStudents = new ArrayList<>();
      
    public void addStudent(String Name, String Surname, String StudentID, int Points){
    Student s = new Student(Name, Surname, StudentID, Points);
    listOfStudents.add(s);
    }
    
    public boolean hasAnRightForCredits(){
    int limit = 50;
    if(Student.getPoints >=limit){ //JV ktereho studenta?
    return true;
    }else{
    return false;
    }
    
    }
    //JV chybi trideni, vyhledani studenta
}
