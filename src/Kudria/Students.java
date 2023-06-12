
package Kudria;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Students {
    ArrayList<Student> students = new ArrayList<>();
    private boolean isEligible;
    void loadFromFile(String fileName) throws IOException{
        Reader in = new FileReader(fileName); //JV naucte si obycejny zpusob, jak nacist soubor, kde jsou data oddelena carkou  
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
        for(CSVRecord record: records){
            String name = record.get("Jmeno Prijmeni"); //JV v souboru byly jmeno a prijmeni oddelene
            String id = record.get("Osobni cislo");
            int totalScore = 0;
            
            for(int i =1; i< 5; i++){ //JV proc jenom 5-krat, uloh bylo v souboru vic
                String score = record.get(Integer.toString(i));
                if (!score.equals("-")){
                    totalScore += Integer.parseInt(score);
                    
                }
            }
            
            boolean isEligible = totalScore >= 50;
            students.add(new Student(name, id, totalScore, isEligible));
        }
    }
    
    void printEligibleStudents(){
        for (Student student: students) {
            if (student.isEligible){
                student.printStudentInfo();
            }
        }
    }
    
    void checkStudentEligiblity(String studentIdOrName){
        for (Student student: students){
            if (student.id.equals(studentIdOrName) || student.name.equals(studentIdOrName)){
                student.printStudentInfo();
                return;
            }
        }
        System.out.println("Student nebyl nalezen"); //JV sout muze byt jen v Main
    }
    void saveToTextFile(String fileName) throws IOException{
        FileWriter writer = new FileWriter(fileName); //JV try with resources, ted pokud nastane vyjimka se stream neuzavre
        for (Student student: students){
            if (student.isEligible){
                writer.write(student.id+ "," + student.name + "," + student.totalScore + "\n"); //JV chybi datum ziskani zapoctu
                
            }
        }
       writer.close();
    }
    void saveToBinaryFile(String fileName) throws IOException{
        DataOutputStream dos =  new DataOutputStream( new FileOutputStream(fileName)); //JV try with resources, ted pokud nastane vyjimka se stream neuzavre
        
        int eligibleStudentCount = 0;
        for (Student student: students){
            if (student.isEligible){
                eligibleStudentCount++;
            }
        }
    dos.writeUTF(fileName.split("-")[0]);
    dos.writeLong(Files.getLastModifiedTime(Paths.get(fileName)).toMillis()); //JV datum je primo v nazvu souboru
    dos.writeInt(students.size());  //JV chteli jsme ulozit jen pocet, kteri maji zapocet
    dos.writeInt(eligibleStudentCount * 100 / students.size());
    dos.close();
}
    }

//Nepodarilo propojit se slou data, a nevim kde je chyba.