
package stitak;

/**
 *
 * @author ul
 */
public class Student {
    private String fristName, lastName,studentsNumber;
    private int pocetBodu;
    boolean zapocet = false;
    
    public Student(String fristName, String lastName, String studentsNumber, int pocetBodu){
        this.fristName = fristName;
        this.lastName = lastName;
        this.studentsNumber = studentsNumber;
        this.pocetBodu = pocetBodu;
        if (pocetBodu>=50){ //JV dejte jako konstantu, ideálne by mohla být nastavena na začátku programu učitelem
            zapocet = true;
        }
    }

    public String getFristName() {
        return fristName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getStudentsNumber() {
        return studentsNumber;
    }

    public int getPocetBodu() {
        return pocetBodu;
    }

    public boolean isZapocet() {
        return zapocet;
    }
    
    @Override
    public String toString() {
        return  studentsNumber + "," + fristName + "," + lastName + "," + pocetBodu + ",";
    }

    
}
