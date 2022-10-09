package Services;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Feedback{
    public String feedbackText = null;

    public void FeedbackFromCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Feedback here: ");
        feedbackText = scanner.nextLine();

        try (FileReader fr = new FileReader("sample.txt");
             BufferedReader br = new BufferedReader(fr)) {
            while ((feedbackText = br.readLine()) != null) {
                System.out.println(feedbackText);
            }
        } catch (IOException ioException) {
            Logger logger = Logger.getLogger(Feedback.class.getName());
            logger.log(Level.SEVERE,"For Developers: File not found exception. Need to be fixed immediately");
            System.out.println("Something went wrong. Please try again!!");
        }
    }
}

