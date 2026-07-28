// BufferReader + FileReader: best for reading text files line by line
// FileInputStream: Best for binary files (eg. Image, audio files)
// RandomAccessFile: Best for Read/Write specific portions of a large Files

import java.io.*;

public class Run {
    public static void main(String[] args) {

        String filePath = "file.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("That file exist!");
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
