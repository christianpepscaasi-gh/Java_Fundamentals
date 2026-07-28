import java.util.Scanner;
public class QuizGame2dArray{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String[][] quizAnswer = {
                {"A) Manila",
                 "B) Cebu",
                 "C) Davao",
                 "D) Tarlac"},
                {"A) Mayon",
                 "B) Mount Apo",
                 "C) Mount Pulag",
                 "D) Mount Kanlaon"},
                {"A) Carabao",
                 "B) Tamarao",
                 "C) Philippine Eagle",
                 "D) Tarsier"},
                {"A) Banana",
                 "B) Ube",
                 "C) Mango",
                 "D) Coconut"},
                {"A) Manpower",
                 "B) Coconut",
                 "C) Rice",
                 "D) Wood"},
        };

        String[] quizQuestions = {
                "What is the Capital of Philippines?",
                "What is the Tallest Mountain in the Philippines?",
                "What is the National Animal of the Philippines?",
                "What is the National Fruit of the Philippines?",
                "On the following, What is the Most exported in the Philippines?"
        };

        char[] correctAnswers = {'A', 'A', 'C', 'C', 'A'};
        int tally=0;

        for (int i = 0; i < quizQuestions.length ; i++){
            System.out.println(quizQuestions[i]);
            for (int j = 0; j < quizAnswer[i].length ; j++){
                System.out.print(quizAnswer[i][j] + " \n");
                    }
            System.out.print("Enter your Answer: ");
            char answer = scanner.next().charAt(0);
            char choice = Character.toUpperCase(answer);

             if(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5
            || choice == 6 || choice == 7 || choice == 8 || choice == 9 || choice == 0){
                System.out.println("Please enter Alphabets(A, B, C, D).");
            } else {
                if(choice == correctAnswers[i]){
                    tally++;
                }
            }

            }
            System.out.println();
        System.out.printf("Correct Answer are "+ tally +" over " +correctAnswers.length);
        }
}