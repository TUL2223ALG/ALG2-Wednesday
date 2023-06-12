
package Kvapil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class fileTools {
    public static ArrayList<Student> ReadFromStudents(credits credits){
            ArrayList<Student> students = new ArrayList<>();
    
    
    try{
        //JV try with resources
        BufferedReader br = new BufferedReader (new FileReader(new File("\\data\\ALG1-ulohy-01022023.csv"))); //JV nedavat nazev souboru sem napevno
        String str;
       
        while((str = br.readLine())!=null){
        int Points = 0;
        String[] strData = str.split(",");
        String Name = strData[0];
        String Surname = strData[1];
        String StudentID = strData[2];
            for (int i = 3; i < 51; i++) { //JV nevhodne napevno
              for(String part : strData){ //JV v strData mate porad i jmeno, prijmeni, ...
            if(part.equals("-")){
            int count = 0;
            }else {
            int count =Integer.parseInt(strData[i]);
                Points+=count;
            }   
            }
            
        }
        double lastDL = Double.parseDouble(strData[51]);   //JV kdyz to nepotrebujete, neukladejte si to 
       credits.addStudent(Name, Surname,StudentID, Points);
        
        }
        
    }catch(IOException e){
    e.printStackTrace(); //JV nevhodne osetreni vyjimky, vypise cervene, kde postupne vznikala chyba 
    }
        return students;
    }
   /*
    public void SaveResultsToFile() {
    try {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data\\ALG1-zapocty.txt"));
         for (int i = 0; i < listOfStudents.size(); i++) {
             bw.write(listOfStudents.get(i).getName()+ " "+listOfStudents.get(i).getSurname()+ " " +listOfStudents.get(i).getPoints());
            
        }
       
    }catch(IOException e){
    e.printStackTrace();
    }
    }
*/
    public void SaveResultsToBinaryFile(String NameOfFile,ArrayList<Student> students){
    try(DataOutputStream dataInputAtream = new DataOutputStream(new FileOutputStram("data\\"+ NameOfFile ))){
    
    
    }catch(IOException e){
    e.printStackTrace();
    }
    
    }
    //JV chybi ulozeni do souboru
}
