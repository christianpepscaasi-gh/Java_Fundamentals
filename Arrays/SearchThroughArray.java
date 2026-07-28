public class SearchThroughArray {
    public static void main(String[] args){

        String[] fruits = {"Banana", "Apple", "Orange", "Grapes"};
        String target = "Orange";
        boolean ifFound = false;

        for (int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at Index no: " + i);
                isFound = true;
                break;
            }
        }

        if(!ifFound){
            System.out.println("Element not found");
        }
    }
}