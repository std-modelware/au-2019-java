package practice01;

import java.util.LinkedList;
import java.util.Scanner;

public class AnotherScanner {
    public static LinkedList<String> readWords() {
        LinkedList<String> words = new LinkedList<String>();

        Scanner scanner = new Scanner(new Scanner(System.in).nextLine());
        scanner.useDelimiter(" ");

        while (scanner.hasNext())
            words.add(scanner.next());

        return words;
    }
}
