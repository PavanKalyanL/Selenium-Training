package ExceptionHandlingRegex;

import java.util.Scanner;


class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}

public class VoteCheck {

    
    static void checkAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("Candidate is not eligible to vote");
        } else {
            System.out.println("Candidate is eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}