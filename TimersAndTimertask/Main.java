import java.util.Timer;
import java.util.TimerTask;
public class Main {
    public static void main(String[] args){
        // Timer = Class that schedules tatkes at specific times or periodically
        // Useful for" sending notifications, schedule, updates, repetitive actions

        // TimerTask = Represent the task taht will be executed by the Timer
        // you will extend the teimerTask class to define you task
        // create a subclass of timertask and override run()

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello World");
                count--;

                if(count == 0){
                    System.out.println("TASK COMPLETED!!!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 3000, 1000);
    }
}