public class TwoDimentionalArray {
    public static void main(String[] args) {
        /*
        String[][] groceries = {
                {"Apple", "Banana", "Watermelon"},
                {"Pork", "Beef", "Lamb"},
                {"Cabbage", "Carrots", "Celery"}
        };

        for(String[] foods : groceries){
            for (String food : foods){
                System.out.println(food);
            }
            System.out.println("------------");
        }
        */

        char[][] telepohone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', "#"},
        };

        for(char row : telepohone){
            for(char number : row){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}