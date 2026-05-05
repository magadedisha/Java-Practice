import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class ReadDesktopFile {
    public static void main(String[] args) {
        try {
            // १. डेस्कटॉपवरील फाईलचा अचूक पत्ता (Path) द्या
            // Windows साठी: "C:/Users/तुमचे_नाव/Desktop/test.txt"
            String filePath = "C:/Users/Admin/OneDrive/Documents/robots.txt"; 
            
            File file = new File(filePath);

            // २. फाईल अस्तित्वात आहे का ते तपासा
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                
                System.out.println("--- File information as---");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("File not found");
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
