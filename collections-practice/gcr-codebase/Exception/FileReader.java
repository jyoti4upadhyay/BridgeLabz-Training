import java.io.*;
public class FileReader {
    public static void main(String[] args){
        try {
            BufferedReader br=new BufferedReader(new FileReader("File.txt"));
            String line;
            While((line=br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    
}
