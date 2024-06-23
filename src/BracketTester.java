import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BracketTester {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Starting Bracket Checker application");
        char[] opening = {'{', '(', '[', '<'};
        char[] closing = {'}', ')', ']', '>'};
//        Scanner in = new Scanner(System.in);
//        String input;
        BracketChecker checker = new BracketChecker(opening, closing);
        String filePath = "assets/brackets03.txt";
        Queue<String> inputQueue = new LinkedList<>(); //queue declaration
        try {
            Scanner in = new Scanner(new FileReader(filePath));
            while (in.hasNextLine()) {

                String input = in.nextLine();
//                if (input.trim().isEmpty()) {
//                    // Skip empty lines
//                    continue;
//                }

                inputQueue.offer(input);
            }
            in.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (!inputQueue.isEmpty()) {
            String input = inputQueue.poll(); // Get the next line from the queue
            System.out.println(input); // Print the line being processed
//            BracketChecker checker = new BracketChecker(opening, closing);
            boolean result = checker.check(input);
            if (result) {
                System.out.println("Syntax Correct");
            } else {
//                System.out.println("Syntax Error");
                for (int i = 0; i < checker.getPosition(); i++) {
                    System.out.print(" ");
                }
                System.out.println("|");
                System.out.println("Syntax Error at position " + checker.getPosition());

            }
        }

        System.out.println("Exiting Checker");
    }

}

