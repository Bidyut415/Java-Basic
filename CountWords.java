import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Trim extra spaces and split by one or more spaces
        String[] words = sentence.trim().split("\\s+");

        // Count words
        int wordCount = words.length;

        // Output
        System.out.println("Total number of words: " + wordCount);
        
        sc.close();
    }
}
