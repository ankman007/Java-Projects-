package WordFinder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pool of words: ");
        String letters = sc.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader("F:\\Java Projects\\Java Bootcamp\\Java Project\\src\\WordFinder\\Dictionary.txt"));

        for (String currentWord= reader.readLine();currentWord!=null;currentWord=reader.readLine()){
            System.out.println(currentWord);
        }

    }
}
