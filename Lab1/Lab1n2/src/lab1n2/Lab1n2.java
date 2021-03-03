package lab1n2;

import java.util.Scanner;

public class Lab1n2 {

    public static void main(String[] args) {
        int input, countday;
        Scanner in = new Scanner(System.in);
        System.out.println("Hari ini adalah hari Senin ");
        System.out.println("Masukan jumlah hari berikutnya: ");
        input = in.nextInt();
        System.out.println("Hari ini adalah hari Senin, hari apakah dalam " + input + " hari berikutnya? ");
        countday = input %7;
        switch (countday){
             case 0:
                System.out.println(input + " hari berikutnya adalah hari Senin");
                break;
            case 1:
                System.out.println(input + " hari berikutnya adalah hari Selasa");
                break;
            case 2:
                System.out.println(input + " hari berikutnya adalah hari Rabu");
                break;
            case 3:
                System.out.println(input + " hari berikutnya adalah hari Kamis");
                break;
            case 4:
                System.out.println(input + " hari berikutnya adalah hari Jumat");
                break;
            case 5:
                System.out.println(input + " hari berikutnya adalah hari Sabtu");
                break;
            case 6:
                System.out.println(input + " hari berikutnya adalah hari Minggu");
                break;
        }
       
    }
    
}
