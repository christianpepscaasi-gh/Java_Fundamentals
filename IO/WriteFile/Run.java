// FileWiter = good for small or medium sized text files.
// BufferedWriter = better performance for large amount of texts
// PrintWriter = Best for Structured Data like logs and reports
// FileOutputSteam = Best for binary files like images or audio files.

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("file.txt");){
            writer.write("Hello World!");
            System.out.println("File written!");
        } catch(FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Could not write to file!");
        }
    }