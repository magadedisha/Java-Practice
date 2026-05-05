import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI; // नवीन बदल
import java.net.URL;

public class ReadUrlFile {
    public static void main(String[] args) {
        try {
            // १. URI वापरून URL तयार करा (नवीन पद्धत)
            String fileUrl = "https://www.geeksforgeeks.org/java/java-networking/";
            URL url = new URI(fileUrl).toURL(); 
            
            // २. डेटा वाचा
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
