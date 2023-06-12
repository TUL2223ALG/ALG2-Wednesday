
package Kvapil;


public class Student implements Comparable<Student> {
    //JV instancni promenne by mely byt private a zacinat malym pismenem
    static int getPoints;    
    String Name;
    String Surname;
    String StudentID;
    int Points;

    public Student(String Name, String Surname, String StudentID, int Points) {
        this.Name = Name;
        this.Surname = Surname;
        this.StudentID = StudentID;
        this.Points = Points;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getStudentID() {
        return StudentID;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

    @Override
    public String toString() {
        return "Student{" + "Name=" + Name + ", Surname=" + Surname + ", StudentID=" + StudentID + ", Points=" + Points + '}';
    }
    
    @Override
    public int compareTo (Student s2){
    if(this.Points > s2.Points){ //JV staci this.Points - s2.Points
    return 1;
    }else if(this.Points<s2.Points){
     return -1;   
    }else{
    return 0;
    }
    }
}
