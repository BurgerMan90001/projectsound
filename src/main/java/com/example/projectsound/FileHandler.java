package com.example.projectsound;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class SaveFile {
    String pathFileName = "filename.txt";
    void create() {
        try {
            File myObj = new File(pathFileName);
            System.out.println(myObj.getPath());
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            this.write();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    void write() {
        try {
            FileWriter myWriter = new FileWriter(pathFileName);
            myWriter.write("FILE");
            myWriter.write("/FREE");
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    void read() {
        try {
            File myObj = new File(pathFileName);
            Scanner myReader = new Scanner(myObj);
            printData(myReader);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    void printData(Scanner myReader) {
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
}