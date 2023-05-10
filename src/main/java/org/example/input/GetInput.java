package org.example.input;
import java.util.Scanner;
public class GetInput {

    public static void main(String[] args) {
        //new java.util.Scanner(System.in).tokens().forEach(System.out::println);
        //new Scanner(System.in).tokens().forEach(System.out::println);

        var scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

}
