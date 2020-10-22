package com.javase.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest01 {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();

        //Date firstTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date firstTime = sdf.parse("2020-10-18 14:53:00");


        timer.schedule(new LogTimerTask(), firstTime, 1000*10);
    }
}

class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        System.out.println(date + ": Backup completed.");
    }
}
