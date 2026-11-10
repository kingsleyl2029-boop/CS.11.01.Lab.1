import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        //prompt the user to type in their name, in an integer
        int age;
        Scanner typedAge = new Scanner(System.in);
        System.out.print("Please enter your age in years:");

        //Scan the page for when the user types in an integer
        age = typedAge.nextInt();

        //calculate the pages that this person needs to read before putting the book down
        int pagesRead = 100 - age;

        //prints this information for the user to see
        System.out.println("As a "+age +"-year old, you should read "+pagesRead+" pages of a book before puting it down.");
    }
}
