package in.kgcoding.File;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try ( FileWriter writer = new FileWriter(fileName)){
            writer.write("This is the best java course. ");
            for (int i = 0; i < 10000; i++) {
                writer.write('*');
            }

            writer.flush();
            System.out.println("File Written Succesfully");
        } catch (IOException exception) {
            System.out.printf("Exception occurred %s\n",exception.getMessage());
        }
    }
}
