/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stitak;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ul
 */
public class Elearning {

    private ArrayList<Student> elearning;
    private String date, nazevPredmetu;

    public Elearning() {
        elearning = new ArrayList();
    }

    public ArrayList<Student> getElearning() {
        ArrayList<Student> elearning1 = elearning; //JV dobrý pokus o defenzivni kopii, ale budete mit jen novou promennou, ktera spristupnuje stejne na vsechny privatni data
        return elearning1;
    }

    public void add(Student student) {
        elearning.add(student);
    }

    public void load(String path) throws IOException {
        File file = new File(path);
        String line, fristLine;
        String firstName, lastName, studentsNumber;
        int pocetBodu;
        try ( FileReader fr = new FileReader(file);  BufferedReader br = new BufferedReader(fr)) {
            try {
                String name = file.getName();
                String[] parts2 = name.split("[-.]");
                nazevPredmetu = parts2[0];
                date = parts2[2];
                fristLine = br.readLine();
                while ((line = br.readLine()) != null) {
                    int vypocet = 0;
                    if (!line.trim().equals("")) {
                        String[] parts = line.split(",");
                        firstName = parts[0];
                        lastName = parts[1];
                        studentsNumber = parts[2];
                        for (int i = 3; i < parts.length-1; i++) {
                            String body = parts[i]; //JV proměnné deklarujte mimo cyklus
                            if (!body.equals("-")){
                                int body1 = Integer.parseInt(parts[i]);
                                vypocet = vypocet + body1;
                            }
                        }
                        pocetBodu = vypocet;
                        elearning.add(new Student(firstName, lastName, studentsNumber, pocetBodu));
                    }
                }
            } finally { //JV, kdyz pouzijete try with resources, uz neni potreba try finally 
                fr.close();
                br.close();
            }
        }
    }

    public void UlozeniDat() throws IOException { //JV idealne rozdelit do dvou metod (metoda ma vzdy delat jen jednu vec) a tehle obe metody jen zavolat
        String path = "data/zapocet.txt";
        File file = new File(path);
        String path2 = "data/zapocet.bin";
        File file2 = new File(path2);
        try ( FileWriter fw = new FileWriter(file);  BufferedWriter bw = new BufferedWriter(fw)) {
            try {
                for (Student s : elearning) {
                    if (s.isZapocet() == true) {
                        String p = s.toString() + date;
                        bw.write(p);
                        bw.newLine();
                    }
                    bw.flush();
                }
            } finally {
                fw.close();
                bw.close();
            }
        }
        try (FileOutputStream outStream = new FileOutputStream(file2); DataOutputStream output = new DataOutputStream (outStream)){
            try{
                output.writeUTF(nazevPredmetu);
                Long date1 = Long.parseLong(date);
                output.writeLong(date1);
                int pocetZ = 0;
                int pocet = elearning.size();
                for (Student s : elearning){
                    if (s.isZapocet()==true){
                        pocetZ = pocetZ++;
                    }
                }
                output.writeInt(pocetZ);
                int procent = (pocetZ/pocet)*100;
                output.writeInt(procent);
            }
            finally{
               outStream.close(); output.close();
            }
        }
    }

    public boolean narokNaZapocetJmeno(String zapocet) {
        String jmeno = zapocet;
        String [] name = jmeno.split(" ");
        for (Student s : elearning){
            if (name[1].equals(s.getLastName())){
                if (name[0].equals(s.getFristName())){
                    return s.isZapocet();
                }
            }
        }
        return false;
    }

    public boolean narokNaZapocetCislo(String zapocet) {
        String jmeno = zapocet;
        for (Student s : elearning){
            if (jmeno.equals(s.getStudentsNumber())){
                    return s.isZapocet();
                }
            }
        return false;
        }
    
    }
