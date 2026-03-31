import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecord {
	public static void main(String[] args) {
        String path = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\student.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] coldata = line.split(",");
                
                int marks = Integer.parseInt(coldata[3]);
                if(marks>80)
                {
                	int id = Integer.parseInt(coldata[0]);
                    String name = coldata[1];
                    int age = Integer.parseInt(coldata[2]);
                System.out.println("Student ID: " + id+" Name: " + name+" Age: " + age+" Marks: " + marks);
            }

	}
        }
        catch (Exception e) {
            System.out.println("File not found");
		}
}
}
