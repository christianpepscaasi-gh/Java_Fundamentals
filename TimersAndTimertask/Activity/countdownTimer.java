import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class countdownTimer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.println("Enter number of seconds to countdown from: ");
        int response = scanner.nextInt();


        TimerTask timerTask = new TimerTask() {

            int count = response;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }
}