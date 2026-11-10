import java.util.Scanner;

public class Dateable {


    public static void main(String[] args) {

        //prompt the user to type in their name, in an integer
        int age;
        Scanner typedAge = new Scanner(System.in);
        System.out.print("Please enter your age in years:");
        age = typedAge.nextInt();

        //Calculate the lowest age that can be dated
        int dateableAge = (age / 2) + 7;

        //Output
        System.out.print(age + "-year olds should date somebody who is at least "+dateableAge+ "-years old.");
    }
}
