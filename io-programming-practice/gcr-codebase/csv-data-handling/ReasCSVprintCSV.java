import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReasCSVprintCSV {
    public static void main(String[] args) {
        String filePath = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\student.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);
                System.out.println("Student ID : " + id + ", Name : " + name + ", Age : " + age + ", Marks : " + marks);

            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}
