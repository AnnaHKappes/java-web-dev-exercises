package studios.lsn2controlflowandcollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine();
        input.close();

        CountingCharacters.countChar(phrase);

//        try {
//            File myFile = new File(
//                    "C:\\Users\\annak\\java-practices\\countingCharacterPhrase.txt");
//            Scanner reader = new Scanner(myFile);
//            String myString = "";
//            while (reader.hasNextLine()) {
//                myString += reader.nextLine();
//            }
//            CountingCharacters.countChar(myString);
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred");
//            e.printStackTrace();
//        }
    }
}
