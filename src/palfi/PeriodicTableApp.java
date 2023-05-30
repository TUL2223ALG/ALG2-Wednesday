/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palfi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ul
 */
public class PeriodicTableApp {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PeriodicTable table = new PeriodicTable();
        try {
            table.loadElements();

            table.loadYears();

            table.printElements();
        } catch (IOException e) {
            System.out.println("Problém se soubory");
            e.getMessage();
        }
    }

}
