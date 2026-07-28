import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;
public class AudioPlayer {
    public static void main(String[] args) {
        String filePath = "flyaway.wav";

        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play.");
                System.out.println("S = Stop.");
                System.out.println("R = Reset.");
                System.out.println("Q = Quit.");
                System.out.print("Enter response: ");
                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid response");
                }
            }

        } catch (FileNotFoundException e){
            System.out.println("Could not find file");
        } catch (IOException e){
            System.out.println("Something went wrong");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported Audio File");
        } catch (LineUnavailableException e) {
            System.out.println("Line not available");
        } finally {
            System.out.println("bye!");
        }
    }
}