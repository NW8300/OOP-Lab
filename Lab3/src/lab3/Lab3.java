package lab3;

import java.util.*;

public class Lab3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        
        int guess, magicnumber;
        magicnumber = rng.nextInt(101);
        guess = 0;
        
        System.out.println("Guess a magic number between 0 and 100");
        
        while(guess != magicnumber){
            System.out.print("\nEnter your guess: ");
                try {
                    guess = in.nextInt();
                }
                catch(InputMismatchException ime){
                    in.nextLine();
                    continue;
                }
            if(guess >= 0 && guess <= 100){
                if(guess > magicnumber)
                    System.out.println("Your guess is too HIGH");
                else if(guess < magicnumber)
                    System.out.println("Your guess is too LOW");
                else
                    System.out.println("YES, the number is " + magicnumber);
            }     
        }
    }
    
}