import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Exercise 1:
//        Create a program that prints “It’s a great day today”.
//        Then ask the user “What is your name?.
//        Then print “Hello [NAME]”
//        System.out.println("It's a great day today");
//        System.out.println("What is your name?");
//        String name = scan.nextLine();
//        System.out.println("Hello " + name);

//        Exercise 2:
//        Ask for the user to enter a number.
//        Ask the user for another number.
//        Print the sum of the two numbers,
//        then the difference of the two numbers.
//
//        System.out.println("Gimme a number");
//        int number1 = scan.nextInt();
//        System.out.println("Gimme another number");
//        int number2 = scan.nextInt();
//        System.out.println("The sum is: " + abs(number1 + number2));
//        System.out.println("The difference is: " + abs(number1 - number2));

//        Exercise 3:
//        Ask the user to enter their balance.
//        Print “I’ve granted you $1.50 more!.
//        Your new balance is: [BALANCE]”

//        System.out.println("How much do you have?");
//        int balance = scan.nextInt();
//        System.out.println("Here's a buck 50");
//        System.out.println(balance + 1.50);

//        Exercise 4:
//        Ask a user to enter a password.
//        Enter a password.
//        Ask user to reenter password.
//        Check to see if they are correct.
//
//        System.out.println("Please Enter Password");
//        String password = scan.nextLine();
//        System.out.println("Please Re-enter Password");
//        String input = scan.nextLine();
//        if(input.equals(password)){
//            System.out.println("Access Granted");
//        }
//        else{
//            System.out.println("Access Denied");
//        }

//        Exercise 5:
//        Print “CORRECT” if 1, 2, or 3 is entered.
//        If anything else is entered print "ERROR".

//        System.out.println("Need Integer");
//        int number = scan.nextInt();
//        if(number == 1 || number == 2 || number == 3)
//        {
//            System.out.println("Correct");
//        }
//        else
//            System.out.println("ERROR");

//        Exercise 6:
//        Ask the user to enter a number.
//        If it’s positive, print “POSITIVE”.
//        If it’s negative, print “NEGATIVE”.
//        If it’s zero, print "ZERO".
//        System.out.println("Enter a number");
//        int number = scan.nextInt();
//
//        if(number > 0)
//            System.out.println("POSITIVE");
//        else if (number < 0)
//            System.out.println("NEGATIVE");
//        else
//            System.out.println("ZERO");

//        Exercise 7:
//        Ask the user for 3 card numbers.
//        If it equals 21 print BLACKJACK!,
//        if it’s greater than 21 print BUST!,
//        if it’s less than 21 print “The total is [TOTAL]”

//        System.out.println("I need your card numbers please");
//        int card = scan.nextInt();
//        int card2 = scan.nextInt();
//        int card3 = scan.nextInt();
//
//        if(card + card2 + card3 == 21){
//            System.out.println("BLACKJACK");
//        }else if(card + card2 + card3 > 21){
//            System.out.println("Bust");
//        }else{
//            System.out.println("Total is: " + (card + card2 + card3));
//        }

//        Exercise 8:
//        Ask the user to enter a number grade. It should print according to the following:
//        A 90 - 100 B 80 - 89 C 70 - 79 D 60 - 69 F 0 - 59
//        If it's negative or over 100 print "Error".

//        System.out.println("Please Enter Grade");
//        int grade = scan.nextInt();
//        if(grade > 100)
//            System.out.println("ERROR");
//        else if(grade >= 90)
//            System.out.println("A");
//        else if( grade >= 80)
//            System.out.println("B");
//        else if(grade >= 70)
//            System.out.println("C");
//        else if( grade >= 60)
//            System.out.println("D");
//        else
//            System.out.println("F");

//        Exercise 9:
//        Ask the user for their height in centimeters.
//        Print their height in feet and inches.
//        System.out.println("I Need your height in centimeters");
//        int cm = scan.nextInt();
//        double inches = (cm * 0.4);
//        double feet = Math.floor(cm/ 30.48);
//        System.out.println(" In feet: " +feet);
//        System.out.println("In inches: "+ inches);

//    Exercise 10:
//
//    Ask the user to enter three numbers.
//    Find the largest of three numbers using only things we learned today.
        System.out.println("I need Three numbers");
        int number = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        if(number > number2 && number > number3)
            System.out.println(number + " Is The largest");
        else if(number2 > number3 && number2 > number)
            System.out.println(number2 + " Is The largest");
        else
            System.out.println(number3 + " Is The largest");
    }

}
