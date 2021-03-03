package lab1n1;

import java.util.Scanner;

public class Lab1n1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input, minutes, seconds;
        System.out.print("Enter an Integer for seconds: ");
        input = in.nextInt();
        minutes = input / 60;
        seconds = input % 60;
        System.out.println(minutes + " minutes " + seconds + " seconds");
    }
   
}