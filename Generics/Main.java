import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        // Generics = a concept where you can write a class, interface or method
        // that is compatible with different Data Types
        // <T> type parameters (placeholder that gets replaced with the real type)
        // <String> type argument (specifies the type)

        Product<String, Double> product = new Product<>("Apples", 10);

        System.out.println(product.getPrice());
    }
}