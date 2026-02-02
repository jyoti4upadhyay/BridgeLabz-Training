import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployee {

    public static void main(String[] args) {

        String filePath ="D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\employee.csv";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name to search: ");
        String search_name = sc.nextLine();

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String name = data[1];

                if (name.equalsIgnoreCase(search_name)) {

                    String department = data[2];
                    String salary = data[3];

                    System.out.println("Employee Found!");
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);
                    found = true;
                    break;
                }

            } if (!found) {
            System.out.println("Employee not found!");
        }


        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }

       
        sc.close();
    }
}
