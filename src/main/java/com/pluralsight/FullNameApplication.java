package com.pluralsight;
import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name ");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine();

        firstName = firstName.trim();
        middleName = middleName.trim();
        lastName = lastName.trim();
        suffix = suffix.trim();

        if (middleName.isEmpty()) {
            middleName = "";
        }
        else {
            String middleNameSpace = " ";
            middleName = middleName + middleNameSpace;
        }

        if (!suffix.isEmpty()) {
            String suffixComma = ", ";
            suffix = suffixComma + suffix;
        }
        else{
            suffix = "";
        }
        System.out.print("Full Name: " + firstName + " " + middleName + lastName + suffix);
    }
}

//        You will prompt the user to enter the parts of their name. You will then create a new
//        string that holds the user’s full name.
//        String[] cities = input.split("\\|");

//        Glen Williams
//        Glen C. Williams
//        Glen Williams, PhD
//        Glen C. Williams, PhD
//        String[] fullName = {firstName, middleName, lastName, suffix};
//        System.out.println(Arrays.toString(fullName));
//        function to use:
//        username.trim().toUpperCase()

//        fullName = input.split(Pattern.quote("|"));


