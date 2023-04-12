
package week07_commandline;

import java.util.Scanner;

public class CmdApp {
public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String command = "a";
        CommandLine cmd = new CommandLine();
        while(!("exit".equals(command))){
            
            System.out.print(cmd.getActualDir() + ">");
            command = sc.nextLine();
            String[] commandA = command.split(" ");
            switch(commandA[0]){
                case "help":
                    String help = cmd.help(commandA[1]);
                    System.out.println(help);
                    
                    break;
                case "dir":
                    String dir;
                    if(commandA.length == 1){
                        dir = cmd.dir();}
                    else {
                        dir = cmd.dir(commandA[1]);
                    }
                    System.out.println(dir);
                    break;
                
                case "cd":
                    //CommandLine.cd(commandA[1]);
                    break;
                case "mkfile":
                    //CommandLine.mkfile(commandA[1]);
                    break;
                case "mkdir":
                    //CommandLine.mkdir(commandA[1]);
                    break;
                case "mkdirs":
                    //CommandLine.mkdirs(commandA[1]);
                    break;
                case "rename":
                    //CommandLine.rename(command[1],command[2]);
                    break;
                    
                default:
                    System.out.println("default");
            }
            
        }
    }
    
}
