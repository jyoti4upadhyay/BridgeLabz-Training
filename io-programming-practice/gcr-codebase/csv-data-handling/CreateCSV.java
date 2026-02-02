import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCSV {

    public static void main(String[] args) {

        String path = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csvDataHandling\\employee.csv";

        try (BufferedWriter bw =new BufferedWriter(new FileWriter(path))) {

            // Header
            bw.write("ID,Name,Department,Salary\n");

            // Employee records
            bw.write("101,Rahul Sharma,Engineering,60000");
            bw.newLine();
            bw.write("102,Priya Verma,HR,45000");
            bw.newLine();
            bw.write("103,Amit Singh,Marketing,50000");
            bw.newLine();
            bw.write("104,Neha Gupta,Finance,55000");
            bw.newLine();
            bw.write("105,Karan Mehta,Sales,48000");
            bw.newLine();
            System.out.println("Employee CSV file created successfully!");

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
