package com.javase.io;

import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        File srcFile = new File("D:\\IO");
        File destFile = new File("C:\\");
        copyDir(srcFile,destFile);
    }

    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()){
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream(srcFile);
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath(): (destFile.getAbsolutePath()+"\\")) + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);

                byte[]bytes = new byte[1024 * 1024];
                int readCount;
                while ((readCount = in.read(bytes)) != -1){
                    out.write(bytes , 0, readCount);
                }

                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in == null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out == null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        File[]files = srcFile.listFiles();
        for (File f : files){
            if (f.isDirectory()){
                String srcDir = f.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath(): (destFile.getAbsolutePath()+"\\")) + srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copyDir(f,destFile);
        }
    }
}
