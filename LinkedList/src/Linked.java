import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        System.out.println(names);
        System.out.println("\n");

        ListIterator<String> iterator = names.listIterator();

        iterator.next();
        iterator.next();
        iterator.next();

        iterator.add("Ray");
        System.out.println(names);
        System.out.println("\n");

        iterator.previous();
        iterator.previous();
        iterator.previous();
        iterator.remove();
        System.out.println(names);
        System.out.println("\n");

        while (iterator.hasPrevious()) {
            iterator.previous();
        }



        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println("\n");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());

        }

        System.out.println("\n");

        names.addFirst("Kay");
        System.out.println(names);
    }

}
