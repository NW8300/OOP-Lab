package lab5n2;

import java.util.*;

public class Lab5n2 {

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        String monthID[] = { "Januari", "Febuari", "Maret", "April",
                             "Mei", "Juni", "Juli", "Agustus",
                             "September", "Oktober", "November", "Desember" };
        
        System.out.println("Tanggal Hari Ini: " + calendar.get(GregorianCalendar.DATE) + " "
                            + monthID[calendar.get(GregorianCalendar.MONTH)] + " "
                            + calendar.get(GregorianCalendar.YEAR));
        
        long TIMEms = calendar.getTimeInMillis();
        int year, month, day;
    
        year = (int) (TIMEms / 3.154e+10);
        TIMEms %= 3.154e+10;
        
        month = (int) (TIMEms / 2.628e+9);
        TIMEms %= 2.628e+9;
        
        day = (int) (TIMEms / 8.64e+7);
        
        System.out.println(String.format("%d Tahun %d Bulan %d Hari setelah tanggal 1 Januari 1970", year, month, day));
    }    
}
   


