package com.javase.ASK;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MasaTidurIO {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);

        String waktuTidur = null;
        boolean waktuTidur2 = false;
        boolean waktuBangun2 = false;
        String waktuBangun = null;
        String nama = null;
        String kelas = null;
        int hour = 0;
        double minutes = 0;

        //Start
        System.out.println("----------------Soal Selidik Masa Tidur Anda----------------");
        System.out.println();
        while (nama == null ) {
            System.out.print("Sila masukkan NAMA anda : ");
            nama = s.nextLine();
        }
        while (kelas == null) {
            System.out.print("Sila masukkan KELAS anda : ");
            kelas = s.nextLine();
        }
        System.out.println("\nSelamat Datang, ["+nama+"]");

        while (!waktuTidur2) {
            //Input Masukkan waktu Tidur
            System.out.print("Sila masukkan waktu TIDUR anda dalam format 24 jam [00:00]-[23:59]: ");
            waktuTidur = s.nextLine();

            //Jika pengguna memasuki waktu Tidur yang berformat salah,system akan memaparkan ERROR dan masukkan sekali lagi.
            waktuTidur2 = (isValidFormat(waktuTidur));
            if (!waktuTidur2) {
                System.out.println("Tolong masukkan waktu TIDUR yang berformat betul.\n\n");
                System.out.println("-------------------------PEMBETULAN-------------------------");
            }
        }
        while (!waktuBangun2) {
            //Input Masukkan waktu Bangun
            System.out.print("Sila masukkan waktu BANGUN anda dalam format 24 jam [00:00]-[23:59]: ");
            waktuBangun = s.nextLine();

            //Jika pengguna memasuki waktu Tidur yang berformat salah,system akan memaparkan ERROR dan masukkan sekali lagi.
            waktuBangun2 = (isValidFormat(waktuBangun));
            if (!waktuBangun2) {
                System.out.println("Tolong masukkan waktu TIDUR yang berformat betul.\n\n");
                System.out.println("-------------------------PEMBETULAN-------------------------");
            }
        }

        //format masa kepada HH:mm
        /*
        HH == Jam
        mm == Minit
         */
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        //Tukar masa kepada millisaat
        Date t1 = format.parse(waktuTidur);

        //Tukar masa kepada millisaat
        Date t2 = format.parse(waktuBangun);

        //Cari bezaan
        long difference ;

        //Jika Tempoh Masa Tidur lebih besar daripada masa Bangun , (masa Bangun + 24 jam - masa Tidur ).
        if (t1.compareTo(t2)> 0) {
            difference = (long) ((t2.getTime() + 8.64e+7) - t1.getTime());
        }
        //Jika Tempoh Masa Tidur lebih kecil daripada masa Bangun, ( masa Bangun - masa Tidur )
        else if (t2.compareTo(t1)> 0) {
            difference = t2.getTime() - t1.getTime();
        }
        //Jika Tempoh Masa Tidur sama dengan masa Bangun
        else{
            difference = 0;
        }

        int[]ar = changeTime(hour, difference);
        System.out.println();
        Output(ar[0],ar[1]);

        //IO -- Data Murid Output ke "D:/IO/MasaTidur"
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:/IO/MasaTidur",true);
            String outAll = (nama + "          " + hour + " Jam  " + minutes + " Minit");
            byte[]bytes = outAll.getBytes();
            byte[]enter = {10};
            byte[] destination = new byte[bytes.length + enter.length];
            System.arraycopy(bytes, 0, destination, 0, bytes.length);
            System.arraycopy(enter, 0, destination, bytes.length, enter.length);

            fos.write(destination);

            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //Memastikan pengguna memasukkan waktu Tidur dan waktu Bangun yang berformat BETUL
    private static boolean isValidFormat(String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ignored) {
        }
        return date != null;
    }

    private static int[] changeTime(int hour, long difference){
        //Tukarkan millisaat kepada minit
        double minutes = (double) difference / 60000;

        //Tukarkan minit kepada jam dan minit
        while (minutes >= 60){
            hour ++;
            minutes -= 60;
        }
        return getExample(hour, (int) minutes);
    }

    private static int[] getExample(int hour, int minutes)
    {
        int[] ar = new int[2];
        ar[0]= hour;
        ar[1]= minutes;
        return ar; //returning two values at once
    }

    //Output
    private static void Output(int hour,int minutes1){
        if (hour < 4){
            System.out.println("Tidak memuaskan. Anda hanya tidur: " + minutes1 + " minit");
        }else if(hour < 6){
            System.out.println("Memuaskan. Anda telah tidur: " + hour + " jam " + minutes1 + " minit");
        }else if (hour < 8){
            System.out.println("Baik. Anda telah tidur: " + hour + " jam " + minutes1 + " minit");
        }else {
            System.out.println("Cemerlang. Anda telah tidur: " + hour + " jam " + minutes1 + " minit");
        }
    }

}
