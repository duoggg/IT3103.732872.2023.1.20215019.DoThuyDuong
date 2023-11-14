package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class NoGarbage {
    public static void main(String[] args) {
    	System.out.println("Do Thuy Duong 20215019");
    	System.out.printf("Using StringBuilder to concenate string: ");
        String filename = "Design/test.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (byte b : inputBytes) {
                sb.append((char) b);
            }
            String outputString = sb.toString();
            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}