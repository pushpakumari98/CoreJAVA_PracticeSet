package FileHandlingJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling1st {

    private static File txt = new File("fileHandling1st.txt");

    public static void main(String[] args) {
        // Code to create a new file
        try {
            if (txt.createNewFile()) {
                System.out.println("File created: " + txt.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Code to write to the file
        try {
            FileWriter fileWriter = new FileWriter(txt);
            fileWriter.write("This is the first file from the Java course");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch(Exception e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading a file
        try {
            Scanner sc = new Scanner(txt); // Use the existing txt object
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //deleting a file
         File myFile=new File("fileHandling1st.txt");
        if(myFile.delete()){
            System.out.println("I have deleted "+myFile.getName());
        }
        else {
            System.out.println("Some error occurred while deleting the file");
        }
    }
}
