import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeDetails {
    int id;
    String name;
    String department;
    double salary;

    EmployeeDetails(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class CSVsortBYsalary {

	public static void main(String[] args) {
		String path="D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\employee.csv";
		List<EmployeeDetails> emp = new ArrayList<>();
		try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] coldata = line.split(",");
                int id=Integer.parseInt(coldata[0]);
                String name=coldata[1];
                String department=coldata[2];
                double salary=Double.parseDouble(coldata[3]);
                EmployeeDetails em = new EmployeeDetails(id, name, department, salary);
                emp.add(em);
            }
		}
		catch (IOException e) {
			System.out.println("File not found");
        }
        Collections.sort(emp, (e1, e2) -> Double.compare(e2.salary, e1.salary));
        System.out.println("Employees sorted by salary Descending:");
        for (EmployeeDetails e : emp) {
            System.out.println(e.id + ", " + e.name + ", " + e.department + ", " + e.salary);
        }
    }
}