import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadRows {
	public static void main(String[] args) {
		String path="D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\employee.csv";
		String line;
		int count=0;
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	            br.readLine();
	            while ((line = br.readLine()) != null) {
	            	count++;	  
	            	
				}
				System.err.println("Number of rows:"+count);


	    } catch (IOException e) {
	            System.out.println("Error reading CSV file");
	        }
	}
}