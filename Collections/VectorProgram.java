package CollectionAssignment;

import java.util.Vector;

public class VectorProgram {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Rolex");
        vector.add("Richard mille");
        vector.add("timex");

        System.out.println("Vector elements: " + vector);

        vector.remove("Rolex");
        System.out.println("After removing Rolex: " + vector);

        System.out.println("Element at index 1: " + vector.get(1));
    }
}