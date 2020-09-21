package com.javase.ASK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tidur {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);

        //Input Masukkan waktu Tidur
        System.out.print("Sila masukkan waktu TIDUR anda dalam format 24 jam [00:00]-[23:59]: ");
        String waktuTidur = s.nextLine();

        //kalau pengguna memasuki waktu Tidur yang tidak berformat,System akan memaparkan ERROR.
        boolean waktuTidur2 = (isValidFormat("HH:mm", waktuTidur));
        if (!waktuTidur2){
            System.out.println("Tolong masukkan waktu TIDUR yang berformat betul.");
            System.exit(0);
        }

        //Input Masukkan waktu Bangun
        System.out.print("Sila masukkan waktu BANGUN anda dalam format 24 jam [00:00]-[23:59]: ");
        String waktuBangun = s.nextLine();

        //kalau pengguna memasuki waktu Bangun yang tidak berformat,System akan memaparkan ERROR.
        boolean waktuBangun2 = (isValidFormat("HH:mm", waktuTidur));
        if (!waktuBangun2){
            System.out.println("Tolong masukkan waktu TIDUR yang berformat betul.");
            System.exit(0);
        }

        //format masa kepada HH:mm
        /*
        HH == Jam
        mm == Minit
         */
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        Date t1;
        //tukar masa kepada millisaat
        t1 = format.parse(waktuTidur);
        Date t2;
        //tukar masa kepada millisaat
        t2 = format.parse(waktuBangun);

        // Cari beza
        long difference ;
        assert t1 != null;
        assert t2 != null;

        //kalau masa Tidur lebih besar daripada masa Bangun , +24 jam untuk masa Bangun.
        if (t1.compareTo(t2)> 0) {
            difference = (long) ((t2.getTime() + 8.64e+7) - t1.getTime());
        } else {//jika tidak ( masa Bangun - masa Tidur )
            difference = t2.getTime() - t1.getTime();
        }
        //tukar millisaat kepada Jam
        long hour = (long) (difference/ 3.6e+6);

        Output(hour);
    }
    //Output
    public static void Output(long hour){
        if (hour < 4){
            System.out.println("Tidak memuaskan. Anda hanya tidur : " + hour + " jam");
        } else if(hour < 6){
            System.out.println("Memuaskan. Anda telah tidur : " + hour + " jam");
        } else if (hour < 8){
            System.out.println("Baik. Anda telah tidur : " + hour + " jam");
        }else if (hour > 8){
            System.out.println("Cemerlang. Anda telah tidur : " + hour + " jam");
        }
    }
    //Cari berformat atau tidak untuk input pengguna
    public static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date != null;
    }
}

