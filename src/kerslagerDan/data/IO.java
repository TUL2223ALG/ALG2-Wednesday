/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kerslagerDan.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
public class IO {
    public String readFile(String path) throws IOException{
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            br.readLine();
            while(!br.toString().equals("")){
                sb.append(br.readLine()).append("\n");
            }
        }
        return sb.toString(); //JV vracejte alespon jako pole String
    }
    public Boolean exists(String path){
        File file = new File(path);
        return file.exists();
    }
    public void saveFile(String path, String vals)throws IOException{
        File file = new File(path);
        try(BufferedOutputStream bos = new BufferedOutputStream(new DataOutputStream(FileOutputStream(vals))){
            
        }catch
    }
}
