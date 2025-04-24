import java.io.FileInputStream;
import java.util.Scanner;

public class BedtimeStories {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // User Prompt
        System.out.println("Please type a number for bedtime story you would like to see: ");
        System.out.println("1. Goldilocks");
        System.out.println("2. Hansel & Gretel");
        System.out.println("3. Mary had a Little Lamb");
        System.out.print("Input Here: ");
        int story = scanner.nextInt();

        FileInputStream fis = new FileInputStream("goldilocks.txt");
        String line;

        if (story == 1) {
            System.out.println(" STORY 1: GOLDILOCKS");
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
            }

        } else if (story == 2) {
            System.out.println("STORY 2: Hansel & Gretel");
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
            }
        else System.out.println("Story 3: Mary had a Little Lamb");

                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    System.out.println(line);