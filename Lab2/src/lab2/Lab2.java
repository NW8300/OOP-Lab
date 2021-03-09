package lab2;

import java.util.*;

public class Lab2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random draw = new Random();
        
        int number = 0;
        String lotterynumber, inputnum;
        lotterynumber = String.format("%d%d", draw.nextInt(10), draw.nextInt(10));
        
        do{
            System.out.print("Input Lottery Draw Number between 0 & 99: ");
            try {
                number = in.nextInt();
            }
            catch(InputMismatchException ime){
                in.nextLine();
                continue;
            }
            if(number >= 0 && number <= 99)
                break;
        }while (true);
        
        inputnum = number >= 10 ? String.valueOf(number) : String.format("0%d", number);
        
        System.out.println("\nWINNING NUMBERS: " + lotterynumber);
        System.out.println("Your DRAW: " + inputnum);
        
        if(inputnum.equals(lotterynumber)){
            System.out.println("\nCONGRATULATIONS! You've WON $10.000");
        }
        else if(inputnum.charAt(0)== lotterynumber.charAt(1)&&inputnum.charAt(1) == lotterynumber.charAt(0)){
            System.out.println("\nCONGRATULATIONS! You've WON $3.000");
        }
        else if(inputnum.charAt(0)== lotterynumber.charAt(0)||inputnum.charAt(0) == lotterynumber.charAt(1)||inputnum.charAt(1) == lotterynumber.charAt(0)||inputnum.charAt(1) == lotterynumber.charAt(1)){
            System.out.println("\nCONGRATULATIONS! You've WON $1.000");
        }
        else
            System.out.println("\nSORRY, You're OUT OF LUCK! Try again next time!");
        
    }
    
}
