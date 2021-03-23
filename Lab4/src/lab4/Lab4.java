package lab4;

import java.util.*;

public class Lab4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
       
        System.out.print("Input number: ");
        number = in.nextInt();
        in.nextLine();
        
        String city[] = new String[number], temp;
        System.out.println("\nInput " + number +" different city name: ");
         for(int i = 0; i < number; ++i)
        {
            city[i] = in.nextLine();
        }
         
       for (int i = 0; i < number; i++) 
        {
            for (int j = i + 1; j < number; j++) 
            { 
                if (city[i].compareTo(city[j]) > 0) 
                {
                    temp = city[i];
                    city[i] = city[j];
                    city[j] = temp;
                }
            }
        }

        System.out.println("\nCity name sorted by alphabetical order: ");
        int x = 1;
        for(int i = 0; i < number; i++) {
            System.out.println(x+". "+city[i]);
            x++;
        }
    }
    
}
