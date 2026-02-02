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
            bw.write("101,Abhay,IT,55000\n");
            bw.write("102,Rahul,HR,45000\n");
            bw.write("103,Priya,Finance,60000\n");
            bw.write("104,Amit,Sales,50000\n");
            bw.write("105,Sneha,Marketing,52000\n");

            System.out.println("Employee CSV file created successfully!");

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
