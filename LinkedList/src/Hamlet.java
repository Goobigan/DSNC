import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Hamlet {
    public static void main(String[] args) {
        String fileName = "C:/Users/t00242943/Downloads/MTUSep24DSC/02. Java Collections Framework/Lab/hamlet.txt";
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;

            TreeSet<String> tree = new TreeSet<String>();

            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println( word +" " + lineNumber);
                    tree.add(word);

                }
                lineNumber++;
                lineParser.close();
            }
            in.close();

            System.out.println("\n");

            Iterator<String> iterator = tree.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());

            }
            System.out.println(tree.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
