import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsers {

	static final Pattern email_pattern = Pattern.compile("^[A-Za-z+_.-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,}$");

    static final Pattern phone_patter =Pattern.compile("^[6-9][0-9]{9}$");

    public static void main(String[] args) {

        String path = "D:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-data-handling\\users.csv";
      

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String id = data[0];
                String email = data[2];
                String phone = data[3];

                boolean valid = true;
                Matcher emailMatcher= email_pattern.matcher(email);
                Matcher phoneMatcher= phone_patter.matcher(phone);

                if (!emailMatcher.matches()) {
                    System.out.println("Invalid Email at ID " + id + " : " + email);
                    valid = false;
                }

                if (!phoneMatcher.matches()) {
                    System.out.println("Invalid Phone at ID " + id + " : " + phone);
                    valid = false;
                }

                if (!valid) {
                    System.out.println("Invalid Row → " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}
