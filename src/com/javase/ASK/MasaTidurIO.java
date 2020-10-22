package com.javase.ASK;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MasaTidurIO {

    //Output
    public static void Output(int hour,int minutes1){
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


    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);

        String waktuTidur = null;
        boolean waktuTidur2 = false;
        boolean waktuBangun2 = false;
        String waktuBangun = null;
            //Start
            System.out.println("----------------Soal Selidik Masa Tidur Anda----------------");
            System.out.println();
            System.out.print("Sila masukkan NAMA anda : ");
            String nama = s.nextLine();

        while (!waktuTidur2) {
            //Input Masukkan waktu Tidur
            System.out.print("Sila masukkan waktu TIDUR anda dalam format 24 jam [00:00]-[23:59]: ");
            waktuTidur = s.nextLine();//23:00

            //kalau pengguna memasuki waktu Tidur yang tidak berformat,System akan memaparkan ERROR dan keluar.
            waktuTidur2 = (isValidFormat("HH:mm", waktuTidur));
            if (!waktuTidur2) {//false
                System.out.println("Tolong masukkan waktu TIDUR yang berformat betul.");
                System.out.println('\n');
                System.out.println("-------------------------PEMBETULAN-------------------------");
            }
        }
        while (!waktuBangun2) {
            //Input Masukkan waktu Bangun
            System.out.print("Sila masukkan waktu BANGUN anda dalam format 24 jam [00:00]-[23:59]: ");
            waktuBangun = s.nextLine();

            //kalau pengguna memasuki waktu Bangun yang tidak berformat,System akan memaparkan ERROR dan keluar.
            waktuBangun2 = (isValidFormat("HH:mm", waktuBangun));
            if (!waktuBangun2) {
                System.out.println("Tolong masukkan waktu TIDUR yang berformat betul.");
                System.out.println('\n');
                System.out.println("-------------------------PEMBETULAN-------------------------");
            }
        }

        //format masa kepada HH:mm
        /*
        HH == Jam
        mm == Minit
         */
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        //tukar masa kepada millisaat
        Date t1 = format.parse(waktuTidur);
        //23:00//1:00

        //tukar masa kepada millisaat//7:00
        Date t2 = format.parse(waktuBangun);

        // Cari beza
        long difference ;

        //kalau masa Tidur lebih besar daripada masa Bangun , (masa Bangun + 24 jam - masa Tidur ).
        if (t1.compareTo(t2)> 0) {
            difference = (long) ((t2.getTime() + 8.64e+7) - t1.getTime());
        }
        //jika masa Tidur lebih kecil daripada masa Bangun, ( masa Bangun - masa Tidur )
        else if (t2.compareTo(t1)> 0) {
            difference = t2.getTime() - t1.getTime();
        }
        //Jika masa Tidur sama dengan masa Bangun
        else{
            difference = 0;
        }

        //tukarkan millisaat kepada minit
        double minutes = (double) difference / 60000;

        //Tukarkan minit kepada  jam dan minit
        int hour = 0;
        while (minutes >= 60){
            hour ++;
            minutes -= 60;
        }
        int minutes1 = (int) minutes;

        System.out.println();
        Output(hour,minutes1);

        //IO -- Data Murid Output ke D:/IO/MasaTidur
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
            System.out.println(ex.getMessage());
        }
        return date != null;
    }
}

