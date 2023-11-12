package com.example.projectsound;

import java.io.*;
import java.util.Scanner;


class SaveFile {
    String pathFileName = "filename.txt";
    //Gson gson = new Gson();



    void createFile() {
        try {
            File myObj = new File(pathFileName);
            System.out.println(myObj.getPath());
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
    void writeToFile(String string,boolean addToFile) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFileName));
            if (addToFile) {
                bufferedWriter.append(string);
            } else {
                bufferedWriter.write(string);
            }
            bufferedWriter.close();


            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
    void readFile() {
        try {
            File myObj = new File(pathFileName);
            Scanner myReader = new Scanner(myObj);
            printData(myReader);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
    void printData(Scanner myReader) {
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
}