
package Kudria;


public class Student {
    String name;
    String id;
    int totalScore;
    boolean isEligible;

   public Student(String name, String id, int totalScore, boolean isEligible) {
     
       this.name = name;
       this.id = id;
       this.totalScore = totalScore;
       this.isEligible = isEligible;
       
   }

   void printStudentInfo(){
       System.out.println("Jmeno a primeni: " +  name);
       System.out.println("Celkem bodu " + totalScore);
       System.out.println("Zapocet " + (isEligible ? "ano" : "ne"));
   }
    }



